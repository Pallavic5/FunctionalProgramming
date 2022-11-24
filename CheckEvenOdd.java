package com.bridgelabz.functionalprogramming;
/*
 * Java Program to Check Whether a Number is Even or Odd
 */
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int number = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = reader.nextInt();

		CheckEvenOdd evenodd = new CheckEvenOdd();
		evenodd.checkEvenodd(number);
		reader.close();

	}

	public int checkEvenodd(int number) {

		if (number % 2 == 0) {

			System.out.println("You have entered even number");
		}

		else {

			System.out.println("You have entered odd number");
		}

		return (number);
		
	}

}
