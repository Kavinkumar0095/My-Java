package com.scanner.com;

import java.util.Scanner;

public class Form {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mobile number");
		long nextLong = s.nextLong();
System.out.println("your mobile number"+ nextLong);
	}
}
