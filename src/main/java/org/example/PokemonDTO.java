package org.example;

public class PokemonDTO {

    @com.fasterxml.jackson.annotation.JsonProperty("height")
    private int height;
    @com.fasterxml.jackson.annotation.JsonProperty("game_indices")
    private java.util.List<GameIndices> gameIndices;
    @com.fasterxml.jackson.annotation.JsonProperty("forms")
    private java.util.List<Forms> forms;
    @com.fasterxml.jackson.annotation.JsonProperty("base_experience")
    private int baseExperience;
    @com.fasterxml.jackson.annotation.JsonProperty("abilities")
    private java.util.List<Abilities> abilities;
}
