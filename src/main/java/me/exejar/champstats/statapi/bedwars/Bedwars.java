package me.exejar.champstats.statapi.bedwars;

import com.google.gson.JsonObject;
import me.exejar.champstats.statapi.HypixelGames;
import me.exejar.champstats.statapi.exception.ApiRequestException;
import me.exejar.champstats.statapi.exception.InvalidKeyException;
import me.exejar.champstats.statapi.exception.PlayerNullException;
import me.exejar.champstats.statapi.stats.Stat;
import me.exejar.champstats.statapi.stats.StatInt;
import me.exejar.champstats.utils.ChatColor;
import me.exejar.champstats.utils.ChatUtils;
import me.exejar.champstats.utils.References;

import java.util.ArrayList;
import java.util.List;

public class Bedwars extends BedwarsUtils {

    private JsonObject bedwarsJson;
    private List<Stat> statList;
    public Stat gamesPlayed, finalKills, finalDeaths, wins, losses, kills, deaths, bedsBroken, bedsLost, winstreak;

    public Bedwars(String playerName, String playerUUID) {
        super(playerName, playerUUID);
        if (setData(HypixelGames.BEDWARS))
            statList = new ArrayList<>();
            setStatsAsync(statList,
                    gamesPlayed = new StatInt("Games Played", "games_played_bedwars", bedwarsJson),
                    finalKills = new StatInt("Final Kills", "final_kills_bedwars", bedwarsJson),
                    finalDeaths = new StatInt("Final Deaths", "final_deaths_bedwars", bedwarsJson),
                    wins = new StatInt("Wins", "wins_bedwars", bedwarsJson),
                    losses = new StatInt("Losses", "losses_bedwars", bedwarsJson),
                    kills = new StatInt("Kills", "kills_bedwars", bedwarsJson),
                    deaths = new StatInt("Deaths", "deaths_bedwars", bedwarsJson),
                    bedsBroken = new StatInt("Beds Broken", "beds_broken_bedwars", bedwarsJson),
                    bedsLost = new StatInt("Beds Lost", "beds_lost_bedwars", bedwarsJson),
                    winstreak = new StatInt("Winstreak", "winstreak_bedwars", bedwarsJson));
    }

    @Override
    public boolean setData(HypixelGames game) {
        this.isNicked = false;
        this.hasPlayed = false;
        JsonObject obj = null;
        boolean isFunctional = false;
        try {
            obj = setGameData(getPlayerUUID(), game);
            isFunctional = true;
        } catch (ApiRequestException ignored) {
        } catch (PlayerNullException ex) {
            this.isNicked = true;
        } catch (InvalidKeyException ex) {
            ChatUtils.sendMessage(ChatColor.RED + "Invalid API Key");
        }

        try {
            if (!this.isNicked && isFunctional) {
                this.hasPlayed = true;
                this.bedwarsJson = obj;
                return true;
            }
            return false;
        } catch (NullPointerException ex) {
            if (!this.isNicked) {
                System.err.println(String.format("%s Maybe %s has never played %s before", References.MODNAME, getPlayerName(), game.getGameName()));
            }

            System.err.println(References.MODNAME + " " + ex.getStackTrace().toString());
            return false;
        }
    }

    @Override
    public String getFormattedStats() {
        return String.format("%s%s", getFkdrColor(getFkdr(this)), getFkdr(this));
    }

    @Override
    public HypixelGames getGame() {
        return HypixelGames.BEDWARS;
    }

    @Override
    public List<Stat> getStatList() {
        return this.statList;
    }
}
