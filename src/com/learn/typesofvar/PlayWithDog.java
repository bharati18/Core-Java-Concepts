package com.learn.typesofvar;

public class PlayWithDog {

	public static void main(String[] args) {

		Dog brownie = new Dog();
		brownie.color = "brown";
		Dog jack = new Dog();
		jack.color = "black";
		System.out.println("brownie " + brownie.color);
		System.out.println("jack " + jack.color);

	}

}
