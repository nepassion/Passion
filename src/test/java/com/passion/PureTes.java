package com.passion;

public class PureTes {

	public static void main(String[] args) {
		String name = PassionApplication.class.getPackage().getName();
		System.out.println(name);
	}

}
