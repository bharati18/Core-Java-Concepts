package com.learn.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		//java supports upcasting not downcasting
		Animal a = (Animal)new Dog();
		//below is downcasting, not supported by java
		//Dog d = (Animal)new Dog();
		boolean result = a.canFly("Dog");
		if(result) {
			System.out.println("can fly");
		}
		else {
			System.out.println("cant fly");
		}
		
	}

}
