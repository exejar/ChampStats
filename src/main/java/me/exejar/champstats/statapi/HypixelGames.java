package me.exejar.champstats.statapi;

public enum HypixelGames {

    BEDWARS("Bedwars"),
    UHC("UHC"),
    SKYBLOCK("Skyblock"),
    SKYWARS("SkyWars"),
    ARENABRAWL("Arena"),
    VAMPIREZ("VampireZ"),
    BLITZ("HungerGames"),
    PIT("Pit");

    private String apiName;

    HypixelGames(String apiName) {
        this.apiName = apiName;
    }

}
