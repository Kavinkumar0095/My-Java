package com.polymorphism.using;

import java.util.Scanner;

public class StudentDetails {
public static void main(String[] args) {
	Scanner Stu = new Scanner (System.in);
	System.out.println("enter your name");
	String name = Stu.next();
	System.out.println("name:"+ name);
	System.out.println("enter your id");
	int id = Stu.nextInt();
	System.out.println("enter your id:"+ id);
	System.out.println("enter your Phone");
	long phone = Stu.nextLong();
	System.out.println("enter your phone:"+ phone);
	System.out.println("enter your height");
	float height = Stu.nextFloat();
	System.out.println("enter your height:"+ height);
		
}

	
}
	
