package org.test;

public class c extends B {
	public c() {
		System.out.println("Default const");
	}

	public static <C> void main(String[] args) {
		C c = new C();
	}

}

