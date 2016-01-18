package com.java2016;

public class Tiger extends Animal{
	public void eat(){ //重写了Animal类的eat方法
		System.out.println("老虎在吃东西");
	}
	public void run(){//自有方法
		System.out.println("老虎再跑");
	}
}
