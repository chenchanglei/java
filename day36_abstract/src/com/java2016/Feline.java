package com.java2016;
//猫科动物
public abstract class Feline {
	private int legCount; //定义腿数量
	private String headShape="round"; //定义头形状
	private boolean meetEater=true;//定义是否为食肉动物
	public int getLegCount() {
		return legCount;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	public String getHeadShape() {
		return headShape;
	}
	public void setHeadShape(String headShape) {
		this.headShape = headShape;
	}
	public boolean isMeetEater() {
		return meetEater;
	}
	public void setMeetEater(boolean meetEater) {
		this.meetEater = meetEater;
	}
	public void cry(){	//普通方法-叫喊
		System.out.println("动物在狂吼");
	}
	public abstract void catchAnimal(Animal animal); //定义捕食的抽象方法，子类去实现
}
