package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameIndices {
    @JsonProperty("version")
    private Version version;
    @JsonProperty("game_index")
    private int gameIndex;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public int getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(int gameIndex) {
        this.gameIndex = gameIndex;
    }
}
