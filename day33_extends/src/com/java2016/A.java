/**
 * 在调用子类构造器时，默认会输出父类的默认构造方法
 * super();在调用子类的构造器的时候，如果没有显示的写出super，那么编译器会默认（隐式）加上super()无参构造方法；
 * 若要调用父类的有参构造方法，那么需要在子类前加super(i),指定参数实现调用；
 * 若已添加有参的super，则系统默认不会添加无参super；
 * 不管是有参还是无参，都必须放在放的第一位；
 */
package com.java2016;

public class A {
	A(){
		System.out.println("调用A的无参构造方法");
	}
	A(int i){
		System.out.println("调用A的有参构造方法");
	}
}
class B extends A{
	B(){
		System.out.println("调用B的无参构造方法");
	}
	B(int i){
		System.out.println("调用B的有参构造方法");
	}
}
class C extends B{
	C(){
		super();//显示调用
		System.out.println("调用C的无参构造方法");
	}
	C(int i){
		super(i);//显示调用
		System.out.println("调用C的有参构造方法");
	}
}