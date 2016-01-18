package com.java2016;

public abstract class AbstractTest1 {
	public abstract void test();	//抽象方法无方法体，为子类提供一个规范，让子类去实现
	public void test2(){	//抽象类中允许有普通方法
		System.out.println("这是普通方法");
	}
}

/**定义
 *1.定义一个类，如果这个类为抽象类，那么此类至少有一个抽象方法；
 *2.在抽象类中的方法不一定是抽象方法，但是类中含有抽象方法，则此类必定是抽象类；（Test.java）
 *使用
 *1.@Override
 *2.一个类继承了抽象类，就必须要重写该抽象类的所有抽象方法；（SubTest.java）
 *3.如果有一个类没有重写抽象类的抽象方法，那么这个类也必须加上abstract作为抽象类（public abstract class SubTest extends Test）
 *
 */