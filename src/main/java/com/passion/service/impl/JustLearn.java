package com.passion.service.impl;

import com.passion.service.LearnInterfaceNewOption;

public class JustLearn implements LearnInterfaceNewOption {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("这是接口实现");
	}

	@Override
	public void defaultTest() {
		System.out.println("这是重写Default方法");
	}

	public static void main(String[] args) {
		JustLearn j = new JustLearn();
		LearnInterfaceNewOption ll = j;

		ll.test();
		ll.defaultTest();
		LearnInterfaceNewOption.staticTest();
	}

}
