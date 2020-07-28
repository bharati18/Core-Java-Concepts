package com.learn.inheritance;

public class Animal {

	String color;
	String size;

	public boolean canFly(String typeOfAnimal) {
		if (typeOfAnimal.equalsIgnoreCase("Bird")) {
			return true;
		} else {
			return false;
		}

	}
}
