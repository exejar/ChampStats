package me.exejar.champstats.statapi.bedwars;

import com.google.gson.JsonObject;
import me.exejar.champstats.statapi.HypixelGames;

public class Bedwars extends BedwarsUtils {

    private JsonObject bedwarsJson;
    private int gamesPlayed, finalKills, finalDeaths,

    public Bedwars(String playerName, String playerUUID) {
        super(playerName, playerUUID);
    }

    @Override
    public String getFormattedStats() {
        return null;
    }

    @Override
    public HypixelGames getGame() {
        return null;
    }
}
