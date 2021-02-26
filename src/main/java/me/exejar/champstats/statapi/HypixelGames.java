package me.exejar.champstats.statapi;

public enum HypixelGames {
    BEDWARS("Bedwars", "Bedwars"),
    UHC("UHC", "UHC"),
    SKYBLOCK("Skyblock", "Skyblock"),
    SKYWARS("SkyWars", "Skywars"),
    ARENABRAWL("Arena", "Arena"),
    VAMPIREZ("VampireZ", "VampireZ"),
    BLITZ("HungerGames", "Blitz"),
    PIT("Pit", "Pit");

    private String apiName, gameName;

    /**
     * @param apiName Name of the Game in Hypixel's API
     * @param gameName Name of the Game which best suits the Player
     */
    HypixelGames(String apiName, String gameName) {
        this.apiName = apiName;
        this.gameName = gameName;
    }

    public String getApiName() { return this.apiName; }

    public String getGameName() { return this.gameName; }

}
