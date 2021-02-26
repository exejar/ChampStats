package me.exejar.champstats.statapi.bedwars;

import com.google.gson.JsonObject;
import me.exejar.champstats.statapi.HypixelGames;
import me.exejar.champstats.statapi.stats.Stat;

import java.util.List;

public class Bedwars extends BedwarsUtils {

    private JsonObject bedwarsJson;
    private Stat gamesPlayed, finalKills, finalDeaths, wins, losses, kills, deaths, bedsBroken, bedsLost;

    public Bedwars(String playerName, String playerUUID) {
        super(playerName, playerUUID);
    }

    @Override
    public void setData() {
        this.isNicked = false;
        this.hasPlayed = false;
        JsonObject obj = null;
        boolean isFunctional = false;
        try {
            obj = setGameData(getPlayerUUID(), "Bedwars");
        }

    }

    @Override
    public String getFormattedStats() {
        return null;
    }

    @Override
    public HypixelGames getGame() {
        return null;
    }

    @Override
    public List<Stat> getStatList() {
        return null;
    }
}
