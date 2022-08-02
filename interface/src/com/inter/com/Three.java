package com.inter.com;

public class Three implements one, Two {

	@Override
	public void twoName() {
		System.out.println("one");
	}

	@Override
	public void oneName() {
		System.out.println("two");

	}

	public static void main(String[] args) {
		Three th = new Three();
		th.oneName();
		th.twoName();
	}

}
