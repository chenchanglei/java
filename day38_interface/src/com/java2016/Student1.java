package com.java2016;

public class Student1 implements Student,People {  //类Student1实现Student、People接口，必须全部实现

	@Override
	public void learn() {
		// TODO Auto-generated method stub、
		System.out.println("学生正在学习");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生正在吃饭");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("学生正在睡觉");
	}

}
