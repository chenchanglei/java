package com.java2016;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu=new Student1();
		stu.learn();
		stu.eat();
		stu.sleep();
		System.out.println(stu.banji); //Student1继承了Student中的banji
		
		System.out.println(Student.name+":"+People.name);//Student和People两个接口有相同的变量，使用接口名.变量名 来访问
	}

}
/**多继承也就是继承多个接口
 * 1.这些接口之间需要使用都好来分割；
 * 2.如果这几个接口都有相同的方法和相同的变量，那么相同的变量可以通过接口名.变量名 的形式来访问，相同的方法将被其中的一个接口使用；
 * 
 *学生正在学习
 *学生正在吃饭
 *学生正在睡觉
 *1201
 *小明:老王
 * 
 * */ 

