package me.exejar.champstats.statapi.stats;

public class StatString extends Stat {
    private String value;

    public StatString(String statName, String jsonName, String value) {
        super(statName, jsonName);
        this.value = value;
    }

    public String getValue() { return this.value; }
}
