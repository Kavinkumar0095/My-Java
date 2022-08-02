package com.loading.over;

public class CollegeDetails {

	public void collegeName(String Name) {
		System.out.println("collegeName:" + Name);
	}

	public void collegeAdd(String streetname, int Pincode, String city, String district) {
		System.out.println("streetname;" + streetname + "pincode:" + Pincode + "city:" + city + "district:" + district);
	}

	public void collegePercentage(char Per) {
		System.out.println("collegePercentage:" + Per);
	}

	public void collegePhone(long phone) {
		System.out.println("collegePhone:" + phone);
	}

	public void collegeRadius(double Rad) {
		System.out.println("collegeRadius:" + Rad);
	}

	public void collegePin(int Pin) {
		System.out.println("collegePin:" + Pin);
	}

	public void collegeRating(float Rating) {
		System.out.println("collegeRating:" + Rating);
	}

	public static void main(String[] args) {
		CollegeDetails cd = new CollegeDetails();
		cd.collegeName("DR.MCET");
		cd.collegeAdd("Palani Main Road" , 622154,  "Pollachi",  "coimbatore");
		cd.collegePercentage((char) 99);
		cd.collegePhone(9597909738l);
		cd.collegeRadius(30.30);
		cd.collegePin(642154);
		cd.collegeRating(9.5f);
	}
}
