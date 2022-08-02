package com.order.second;

public class MyFriend {
	public void friendDetail(String name) {
		System.out.println("name:" + name);
	}

	public void friendId(int Id) {
		System.out.println("Id" + Id);
	}

	public void friendphone(long phone) {
		System.out.println("phone:" + phone);
	}

	public void friendHeight(float Height) {
		System.out.println("Height:" + Height);
	}

	public void friendSalary(double Salary) {
		System.out.println("Salary:" + Salary);
	}

	public void friendclgPercentage(char Percentage) {
		System.out.println("Percentage:" + Percentage);
	}

	public static void main(String[] args) {
		MyFriend mf = new MyFriend();
		mf.friendDetail("Mohan");
		mf.friendId(12345);
		mf.friendphone(7397066577l);
		mf.friendHeight(5.5f);
		mf.friendSalary(100.100);
		mf.friendclgPercentage((char) '9');

	}

}
