package me.exejar.champstats.statapi;

import net.minecraft.entity.player.EntityPlayer;

import java.util.HashMap;
import java.util.List;

public class HPlayer {

    private HashMap<HGameBase, List<String>> gameStatMap;
    private String playerUUID, playerName;

    /**
     * @param playerUUID Player's UUID
     * @param playerName Player's Name
     * @param gameBase All HGameBase's you would like the HPlayer to contain
     * (Generally you would like all HGameBases which are complete to be added)
     */
    public HPlayer(String playerUUID, String playerName, HGameBase... gameBase) {
        this.playerUUID = playerUUID;
        this.playerName = playerName;

        gameStatMap = new HashMap<>();
        for (HGameBase game : gameBase) {
            this.gameStatMap.put(game, game.getStatList());
        }
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public String getPlayerName() {
        return playerName;
    }

}
