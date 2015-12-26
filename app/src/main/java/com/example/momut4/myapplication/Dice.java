package com.example.momut4.myapplication;

import java.util.Random;

/**
 * Tärningsklass
 * Created by momut4 on 2015-11-17.
 */
public class Dice {
    int number = 0;

    /**
     * Rullar en tärning
     * @return Tärningens värde
     */
    public int roll() {
        Random ran = new Random();
        int rannum = ran.nextInt(6) + 1;
        return rannum;
    }
}
