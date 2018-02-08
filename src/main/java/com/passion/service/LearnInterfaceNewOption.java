package com.passion.service;

public interface LearnInterfaceNewOption {
	public default void defaultTest() {
		System.out.println("这是一个默认方法 Default");
	}

	public static void staticTest() {
		System.out.println("这是一个静态方法Static");
	}

	public void test();
}
