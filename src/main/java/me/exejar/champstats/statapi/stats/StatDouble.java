package me.exejar.champstats.statapi.stats;

import com.google.gson.JsonObject;

public class StatDouble extends Stat {
    private double value;

    /**
     * @param statName Name of the Stat
     * @param jsonName Json Name of the Stat in Hypixel's API
     * @param gameObject JsonObject of the desired Game Stat
     */
    public StatDouble(String statName, String jsonName, JsonObject gameObject) {
        super(statName, jsonName, gameObject);
    }

    @Override
    public void setStat() {
        try {
            this.value = Double.parseDouble(gameObject.get(jsonName).toString());
        } catch (NullPointerException ex) {
            this.value = 0;
        }
    }

    public double getValue() { return this.value; }
}
