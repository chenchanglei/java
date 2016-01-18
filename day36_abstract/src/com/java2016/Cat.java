package com.java2016;

public class Cat extends Feline {
	public void catchAnimal(Animal animal){
		if(animal instanceof Mouse){
			System.out.println("猫在捕食老鼠");
		}else{
			System.out.println("猫不能捕食老鼠");
		}
	}
}
