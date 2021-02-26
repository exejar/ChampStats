package me.exejar.champstats.statapi.stats;

import com.google.gson.JsonObject;

public class StatInt extends Stat {
    private int value;

    /**
     * @param statName Name of the Stat
     * @param jsonName Json Name of the Stat in Hypixel's API
     * @param gameObject JsonObject of the desired Game Stat
     */
    public StatInt(String statName, String jsonName, JsonObject gameObject) {
        super(statName, jsonName, gameObject);
    }

    @Override
    public void setStat() {
        try {
            this.value = Integer.parseInt(gameObject.get(jsonName).toString());
        } catch (NullPointerException ex) {
            this.value = 0;
        }
    }

    public int getValue() { return this.value; }
}
