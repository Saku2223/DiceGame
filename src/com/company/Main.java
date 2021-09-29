package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        // System.out.println("First Random int is " + random.nextInt(10));
        // System.out.println("First Random double is " + random.nextDouble());

        // int min = 5;
        // int max = 10;
        // int newRandom = random.nextInt((max - min) + 1) + min;
        // System.out.println(newRandom);
        // System.out.println(Math.random());

        // int rand = (int) (Math.random()*10);
        // System.out.println(rand);

        System.out.println("How many sides do you want your dice to have");
        int sideDice = input.nextInt();
        System.out.println("How many times do you want to throw your dice?");
        int timesThrown = input.nextInt();
        for (int i = 0; i < timesThrown; i++) {
            int min = 1;
            int max = sideDice;
            int newRandom = random.nextInt((max - min) + 1) + min;
            System.out.println("Roll is" + " " + newRandom);

        }
    }
}
