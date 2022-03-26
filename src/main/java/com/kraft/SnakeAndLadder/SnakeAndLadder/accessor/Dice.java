package com.kraft.SnakeAndLadder.SnakeAndLadder.accessor;

import java.util.Random;

public class Dice {

    Dice() {

    }

    //roll from 1 to 6;
    public static Integer getDiceValue() {
        // create instance of Random class
        Random rand = new Random();
        int random = rand.nextInt(6);
        return random+1;
    }

}
