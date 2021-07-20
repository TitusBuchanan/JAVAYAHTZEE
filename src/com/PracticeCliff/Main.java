package com.PracticeCliff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner((System.in));
        System.out.println("What is your first name");
        String input = scanner.nextLine();
        System.out.println("What is your last name");
        String last = scanner.nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();

        System.out.println("Hello, I'm "+ last + "," + input + " " + last +" I am" + age + " Years old");

//        Die die = new Die();
//        die.roll();
//        System.out.println(die.faceUpValue);
    }
}
