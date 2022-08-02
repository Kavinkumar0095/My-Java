package com.details.stadium;

public class Son extends Father{


	@Override
	public void fatherName() {
		System.out.println("father name is krishnamoorthi:");
		
	}
public static void main(String[] args) {
	Son son = new Son();
	son.fatherDetail();
	son.fatherName();
}
	
}

