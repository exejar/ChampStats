package me.exejar.champstats.statapi;

import com.google.gson.JsonObject;
import me.exejar.champstats.statapi.stats.Stat;
import net.minecraft.entity.player.EntityPlayer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract class HGameBase extends HypixelAPI {

    private String playerName, playerUUID;
    private EntityPlayer player;
    public boolean isNicked;
    public boolean hasPlayed;

    public HGameBase(String playerName, String playerUUID) {
        this.playerName = playerName;
        this.playerUUID = playerUUID;
    }

    public HGameBase(EntityPlayer player) {
        this.playerName = player.getName();
        this.playerUUID = player.getUniqueID().toString();
        this.player = player;
    }

    /**
     * @return String of all Formatted Stats combined
     */
    public abstract String getFormattedStats();

    /**
     * @return Game Enumeration of sub-classes Game
     */
    public abstract HypixelGames getGame();

    /**
     * @return List of Every Formatted Stat from respective Game
     */
    public abstract List<Stat> getStatList();

    public String getPlayerName() {
        return this.playerName;
    }

    public String getPlayerUUID() {
        return this.playerUUID;
    }

    public EntityPlayer getPlayerEntity() {
        return this.player;
    }

    public boolean getIsNicked() {
        return this.isNicked;
    }

    public boolean getHasPlayed() {
        return this.hasPlayed;
    }

    protected List<Stat> setStats(JsonObject gameObject, Stat... stats) {
        LinkedList<Stat> statList = new LinkedList<>();

        for (Stat stat : stats) {
            statList.add(stat);
        }

        return statList;
    }

}
