package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Abilities {
    @JsonProperty("slot")
    private int slot;
    @JsonProperty("is_hidden")
    private boolean isHidden;
    @JsonProperty("ability")
    private Ability ability;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
