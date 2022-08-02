package com.details.stadium;

public class StadiumDetails {

	public StadiumDetails() {
		System.out.println("enter the stadiumDetails");
}
public StadiumDetails(String name) {
		System.out.println("enter the stadium name:" + name);
}
public StadiumDetails(int Gatenumber) {
		System.out.println("enter the Gatenumber:" + Gatenumber);
}
public StadiumDetails(long Stadiumphone) {
		System.out.println("enter the Stadiumphone:" + Stadiumphone);
}
public StadiumDetails(float Stadiumarea) {
		System.out.println("enter the Stadiumarea:" + Stadiumarea);
}
public StadiumDetails(double Stadiumcapacity) {
	System.out.println("enter the Stadiumcapacity:" + Stadiumcapacity);
		}
public StadiumDetails(char Stadiumincity) {
		System.out.println("enter the Stadiumincity:" + Stadiumincity);
}
public static void main(String[] args) {
		StadiumDetails sd = new StadiumDetails();
		StadiumDetails sd1 = new StadiumDetails("vankade");
		StadiumDetails sd2 = new StadiumDetails(12);
		StadiumDetails sd3 = new StadiumDetails(9597909738l);
		StadiumDetails sd4 = new StadiumDetails(20.20f);
		StadiumDetails sd5 = new StadiumDetails(222.222);
		StadiumDetails sd6 = new StadiumDetails('1');
}

}
