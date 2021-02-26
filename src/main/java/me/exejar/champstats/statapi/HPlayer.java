package me.exejar.champstats.statapi;

import net.minecraft.entity.player.EntityPlayer;

public class HPlayer {

    private HGameBase gameBase;

    public HPlayer(HGameBase gameBase) { this.gameBase = gameBase; }

    public String getPlayerUUID() { return gameBase.getPlayerUUID(); }

    public String getPlayerName() { return gameBase.getPlayerName(); }

    public String getFormattedStats() { return gameBase.getFormattedStats(); }

    public EntityPlayer getPlayerEntity() { return gameBase.getPlayerEntity(); }

    public HypixelGames getGame() { return gameBase.getGame(); }

}
