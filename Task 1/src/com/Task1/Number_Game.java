package com.Task1;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Guess the number");

		int guess;
		// Generate a Random Number

		Random ran = new Random();
		int n = ran.nextInt(100);

		int i = 0;
		do {

			guess = in.nextInt();

			if (n == guess) {
				System.out.println("Congrats! You are right. You Won");
			} else if (guess > n) {
				System.out.println("It's too high");

			} else {
				System.out.println("It's too low");
			}
			i++;
		} while (n != guess & i<=3);
		System.out.println();
		System.out.println("Number of Attempts are Over. You lose");
	}
}