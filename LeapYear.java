package com.bridgelabz.functionalprogramming;
/*
 * Program to print the year is a Leap Year or not.
 */
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");

		int year = scanner.nextInt();

		LeapYear leapyear = new LeapYear();
		System.out.println(leapyear.isLeapYear(year) ? "It is a Leap Year" : "It is not a Leap Year");
		
		scanner.close();
	}

	public boolean isLeapYear(int year) {

		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

}
