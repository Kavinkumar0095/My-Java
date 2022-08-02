package com.data.my;

public class GrandParent {

	private void GrantParent() {
		System.out.println("my grantParent is karuppusamy");
	}

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		ParentDetails gp1 = new ParentDetails();
		ChildDetails gp2 = new ChildDetails();
		gp.GrantParent();
		gp1.fatherName();
		gp1.motherName();
		gp2.myName();
	}

}
