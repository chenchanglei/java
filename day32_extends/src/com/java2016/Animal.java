/**
 * 继承使用extends关键字，只能使用单继承，不支持多重继承
 * 父类（超类、基类）：动物类
 * 子类继承父类后，子类调用父类的属性和方法，也可以重写父类的属性和方法，还可以增加自己的属性和方法。
 */
package com.java2016;

public class Animal {
	private String type;
	private String skin;//肤色
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public int getLegCount() {
		return legCount;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	private int legCount;//几条腿
	
	public void eat(){
		System.out.println("动物在吃");
	}
	public void huxi(){
		System.out.println("动物在呼吸");
	}
}
