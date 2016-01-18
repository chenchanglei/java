package com.java2016;

public class Test {
	public static void main(String[] args){
//		Animal a=new Animal();
//		a.showMe();
//		Animal t=new Tiger();
//		t.showMe();
//		Animal c=new Cat();
//		c.showMe();
		Animal t=new Tiger();
		Animal c=new Cat();
		Animal d=new Dog();
		Tiger e=new Tiger();//
		showMe(t);
		showMe(c);
		showMe(d);
		showMe(e);
	}
	public static void showMe(Animal a){ //定义showMe方法
		a.showMe();
	}
}

/**结果：
 * 我是老虎
 * 我是猫
 * 我是狗
 * 我是老虎
 */


/**所谓多态，实际上就是个对象的多种形态，在这个例子里：
 * Tiger 可以看做Tiger，也可以看做Animal
 * Cat   可以看做Cat，也可以看做Animal
 * Dog   可以看做Dog，也可以看做Animal
 */
