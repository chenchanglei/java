package com.java2016;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MTest mt=new MTest();//使用引用对象调用方法
		System.out.println(mt.jia(20, 5));
		System.out.println(mt.jian(20, 5));
		System.out.println(mt.cheng(20, 5));
		System.out.println(mt.chu(20, 5));
		//第二种方式使用接口类型引用调用
		Jia m=mt;
		System.out.println("使用接口类型引用调用");
		System.out.println(m.jia(20, 5));
		Jian mtt=mt;
		System.out.println(mtt.jian(20, 5));
		Cheng mttt=mt;
		System.out.println(mttt.cheng(20, 5));
		Chu mtttt=mt;
		System.out.println(mtttt.chu(20, 5));
	}
}
interface Jia{
	int jia(int a,int b);
}
interface Jian{
	int jian(int a,int b);
}
interface Cheng{
	int cheng(int a,int b);
}
interface Chu{
	int chu(int a,int b);
}

