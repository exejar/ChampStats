package me.exejar.champstats.statapi.stats;

public class StatInt extends Stat {
    private int value;

    public StatInt(String statName, int value) {
        super(statName);
        this.value = value;
    }

    public int getValue() { return this.value; }
}
