package com.exception.com;

public class Demo {

	public static void main(String[] args) {
		
			try {
				System.out.println(10/5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Enna oru villa thanam");
			}
		System.out.println("shobba ippovey kanna kattuthey");
	}

}
