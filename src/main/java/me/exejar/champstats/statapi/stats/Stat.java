package me.exejar.champstats.statapi.stats;

public abstract class Stat {

    private String statName;

    public Stat(String statName) {
        this.statName = statName;
    }

    public String getStatName() { return this.statName; }

}
