package me.exejar.champstats.statapi;

import com.google.gson.JsonObject;
import me.exejar.champstats.statapi.stats.Stat;
import me.exejar.champstats.statapi.stats.StatDouble;
import me.exejar.champstats.statapi.stats.StatInt;
import me.exejar.champstats.statapi.stats.StatString;
import me.exejar.champstats.utils.Handler;
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

    /**
     * Method to set the Game Data
     */
    public abstract void setData();

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
            stat.setStat();
            statList.add(stat);
        }

        return statList;
    }

    protected void setStatsAsync(JsonObject gameObject, Stat... stats) {
        for (Stat stat : stats) {
            Handler.asExecutor(stat::setStat);
        }
    }

}
