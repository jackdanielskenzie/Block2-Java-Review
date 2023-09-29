package org.example;

import java.util.Random;

public class ThickCoin extends Coin {
    String topSide;
    String bottomSide;
    public void flip() {
        Random flipper = new Random();

        int randomChance = flipper.nextInt(101);

        if (randomChance < 50) {
            this.topSide = "Tails";
        } else if (randomChance <= 99) {
            this.topSide = "Heads";
        } else {
            // 1 in 101 chance of landing on the side
            this.topSide = "Side";
        }
    }
}
