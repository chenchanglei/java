//封装 使用private私有属性和方法，使用set/get方法提供外部接口
//在set方法中添加判断机制，使方法更加健壮
package com.java2016;

public class Student {
	private String name;
	private String sex;
	private int age;
	private String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		
		if(age>24){
			this.age = age;
		}else{
			System.out.println("输入的年龄为："+age+"，age小于24");
		}
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
