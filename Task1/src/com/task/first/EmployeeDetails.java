package com.task.first;

public class EmployeeDetails {

	public static void empName(String name) {
		System.out.println("Name is:" + name);
	}

	public static void empId(int Id) {
		System.out.println("Id is:" + Id);
	}

	public static void empDob(String Dob) {
		System.out.println("Dob is:" + Dob);

	}

	public static void empPhone(long Phone) {
		System.out.println("Phone is:" + Phone);

	}

	public static void empEmail(String Email) {
		System.out.println("Email is:" + Email);

	}

	public static void empAdd(String Add) {
		System.out.println("Add is:" + Add);

	}

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.empName("Kavin");
		emp.empId(12345);
		emp.empDob("11.08.1995");
		emp.empPhone(1234567890l);
		emp.empEmail("xyz@gmail.com");
		emp.empAdd("3/74 udumalpet");

	}
}
