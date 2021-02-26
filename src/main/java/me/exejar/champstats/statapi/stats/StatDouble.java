package me.exejar.champstats.statapi.stats;

public class StatDouble extends Stat {
    private double value;

    public StatDouble(String statName, String jsonName, double value) {
        super(statName, jsonName);
        this.value = value;
    }

    public double getValue() { return this.value; }
}
