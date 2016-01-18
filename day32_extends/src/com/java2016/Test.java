package com.java2016;

public class Test {
	public static void main(String[] args){
		Tiger t=new Tiger();	//新建老虎类对象
		t.huxi();   //继承父类的huxi方法
		t.eat();	//继承父类eat，并做了重写
		t.run();	//Tiger的自有方法
		t.setSkin("金黄色");
		t.setType("猫科动物");
		t.setLegCount(4);
		System.out.println("老虎"+t.getSkin()+t.getType()+t.getLegCount()+"条腿");
		
		Sheep s=new Sheep();
		s.eat();//Sheep重写了Animal的eat方法
		s.fire();//Sheep自有方法
	}
}
