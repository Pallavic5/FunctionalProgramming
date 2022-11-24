package com.bridgelabz.functionalprogramming;
/*
 * Prints the Nth harmonic number:
 */
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		double number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scanner.nextDouble();
		double harmonicValue = harmonicCalculation(number);
		System.out.println("Nth Harmonic value = " + harmonicValue);
		scanner.close();

	}

	public static double harmonicCalculation(double number) {
		double sum = 0;
		if (number != 0) {

			for (double i = 1; i <= number; i++) {
				sum = sum + (1 / i);
			}

		} else {

			System.out.println("Number is equal to zero.");
		}

		return sum;
	}
}