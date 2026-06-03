package com.practice.basics;

import java.util.Random;
import java.util.Scanner;

/**
 * 10. Number Guessing Game
 * Simple interactive console game using random numbers.
 */
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            attempts++;
            try {
                int guess = scanner.nextInt();
                if (guess == answer) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    break;
                } else if (guess < answer) {
                    System.out.println("Too low. Try again:");
                } else {
                    System.out.println("Too high. Try again:");
                }
            } catch (Exception e) {
                System.err.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
