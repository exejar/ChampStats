package me.exejar.champstats.statapi.bedwars;

import me.exejar.champstats.statapi.HGameBase;
import me.exejar.champstats.statapi.stats.StatInt;
import me.exejar.champstats.utils.ChatColor;
import me.exejar.champstats.utils.MathUtils;

public abstract class BedwarsUtils extends HGameBase {
    public BedwarsUtils(String playerName, String playerUUID) {
        super(playerName, playerUUID);
    }

    public double getFkdr(Bedwars bw) {
        return MathUtils.formatDouble(((StatInt)bw.finalKills).getValue(), ((StatInt)bw.finalDeaths).getValue());
    }

    public ChatColor getFkdrColor(double fkdr) {
        if (fkdr < 1) {
            return ChatColor.DARK_GRAY;
        } else if (fkdr < 5) {
            return ChatColor.GRAY;
        } else if (fkdr < 10) {
            return ChatColor.WHITE;
        } else if (fkdr < 20) {
            return ChatColor.GOLD;
        } else if (fkdr < 35) {
            return ChatColor.DARK_GREEN;
        } else if (fkdr < 60) {
            return ChatColor.RED;
        } else if (fkdr < 100) {
            return ChatColor.DARK_RED;
        } else if (fkdr < 500) {
            return ChatColor.LIGHT_PURPLE;
        } else {
            return ChatColor.DARK_PURPLE;
        }
    }

}
