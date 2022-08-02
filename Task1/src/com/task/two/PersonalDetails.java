package com.task.two;

import java.util.Scanner;

public class PersonalDetails {
	public static void main(String[] args) {
		Scanner two = new Scanner(System.in);
		System.out.println("enter your name");
		String name = two.next();
		System.out.println("name:" + name);
		System.out.println("enter you empId");
		int empId = two.nextInt();
		System.out.println("empId:" + empId);
		System.out.println("enter your email");
		String email = two.next();
		System.out.println("email:" + email);
		System.out.println("enter your phoneNumber");
		long phoneNumber = two.nextLong();
		System.out.println("phoneNumber:" + phoneNumber);
		System.out.println("enter your salary");
		float salary = two.nextFloat();
		System.out.println("salary:" + salary);
		System.out.println("enter your Gender");
		String Gender = two.next();
		System.out.println("Gender:" + Gender);
		System.out.println("enter your cityName");
		String cityName = two.next();
		System.out.println("cityName:" + cityName);
		System.out.println("enter your avgMark");
		double avgMark = two.nextDouble();
				System.out.println("avgMark:"+ avgMark);

	}
}
