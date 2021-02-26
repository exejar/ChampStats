package me.exejar.champstats.statapi.stats;

import com.google.gson.JsonObject;

public class StatString extends Stat {
    private String value;

    /**
     * @param statName Name of the Stat
     * @param jsonName Json Name of the Stat in Hypixel's API
     * @param gameObject JsonObject of the desired Game Stat
     */
    public StatString(String statName, String jsonName, JsonObject gameObject) {
        super(statName, jsonName, gameObject);
    }

    @Override
    public void setStat() {
        try {
            this.value = gameObject.get(jsonName).toString();
        } catch (NullPointerException ex) {
            this.value = "";
        }
    }

    public String getValue() { return this.value; }
}
