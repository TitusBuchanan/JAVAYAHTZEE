package com.PracticeCliff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player Titus = new Player("Titus");
        Player Rick = new Player("Rick");

        Titus.cup.roll();
        System.out.println(Titus.cup.displayCup());
        Rick.cup.roll(3);
        System.out.println(Rick.cup.displayCup());
    }
}
