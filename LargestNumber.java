package com.bridgelabz.functionalprogramming;
/*
 * Program to Find the Largest Among Three Numbers
 */
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		int firstNumber, secondNumber, thirdNumber, temp, largestNumber;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number");
		firstNumber = scanner.nextInt();

		System.out.println("Enter a second number");
		secondNumber = scanner.nextInt();

		System.out.println("Enter a third number");
		thirdNumber = scanner.nextInt();

		temp = firstNumber > secondNumber ? firstNumber : secondNumber;

		largestNumber = thirdNumber > temp ? thirdNumber : temp;

		System.out.println("The Largest Number is: " + largestNumber);

		scanner.close();

	}

}
