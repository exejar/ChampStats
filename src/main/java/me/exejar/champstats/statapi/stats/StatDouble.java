package me.exejar.champstats.statapi.stats;

public class StatDouble extends Stat {
    private double value;

    public StatDouble(String statName, double value) {
        super(statName);
        this.value = value;
    }

    public double getValue() { return this.value; }

}
