/**继承关系：
 * 人、中国人、河北人
 */
package com.java2016;

public class People {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println("人在吃饭");
	}
}
