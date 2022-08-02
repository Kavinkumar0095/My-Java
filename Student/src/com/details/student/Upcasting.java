package com.details.student;

public class Upcasting extends Student {

	public static void main(String[] args) {
		Student stu = new Upcasting();
		stu.stuName("Kavin");
		stu.stuId(123456);
		stu.stuPhone(9597909738l);
		stu.stuCgpa(9.1f);
		stu.stuGrade('S');

	}

}
