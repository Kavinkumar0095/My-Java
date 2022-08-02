package org.test;

public class D extends E{
	public D() {
		super(12);
		System.out.println("Default const");
	}

	public static void main(String[] args) {
		D d = new D();
	}


}
