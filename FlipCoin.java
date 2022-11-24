package com.bridgelabz.functionalprogramming;

/*
 * Flip Coin and print percentage of Heads and Tails.
 */
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		int number, headCount = 0, tailCount = 0;
		double heads, tails;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many times you want to flip the coin: ");
		number = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			double randomNumber = Math.random();
			System.out.println(randomNumber);

			if (randomNumber < 0.5) {

				tailCount++;
			} else {
				headCount++;
			}

			heads = headCount / (double) number * 100;
			tails = tailCount / (double) number * 100; // denominator calculation 0.02*100=200
			System.out.println("Percentage of heads: " + heads + "%");
			System.out.println("Percentage of tails: " + tails + "%");
			scanner.close();
		}
	}

}
