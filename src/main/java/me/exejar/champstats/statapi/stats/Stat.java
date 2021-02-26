package me.exejar.champstats.statapi.stats;

public abstract class Stat {
    private String statName, jsonName;

    public Stat(String statName, String jsonName) {
        this.statName = statName;
        this.jsonName = jsonName;
    }

    public String getJsonName() { return this.jsonName; }

    public String getStatName() { return this.statName; }

}
