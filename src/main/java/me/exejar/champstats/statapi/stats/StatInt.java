package me.exejar.champstats.statapi.stats;

public class StatInt extends Stat {
    private int value;

    public StatInt(String statName, String jsonName, int value) {
        super(statName, jsonName);
        this.value = value;
    }

    public int getValue() { return this.value; }
}
