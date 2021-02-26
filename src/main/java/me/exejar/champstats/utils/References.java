package me.exejar.champstats.utils;

import java.util.regex.Pattern;

public interface References {
    String PREFIX = ChatColor.DARK_GRAY + "----------------------[" + ChatColor.RED + "CSTATS" + ChatColor.RED + "]----------------------\n";
    String SUFFIX = "\n" + ChatColor.DARK_GRAY + "---------------------------------------------------";
    Pattern UUID = Pattern.compile("\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}");
    Pattern UUID_NO_DASHES = Pattern.compile("\\w{32}");

    String MODNAME = "ChampStats";
    String MODID = "champstats";
    String VERSION = "1.0-DEV";

    String MODNAMEPREF = "[CSTATS]";
}
