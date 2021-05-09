package com.singleton.job;

public class Abc {
	private static Abc abc = new Abc();
	private Abc(){
		System.out.println("Obj Created");
	}
	public static Abc getInstance(){
		
		return abc;
		
	}
}
