package com.learn.objectorientedmeaning;

public class SpecsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecsBox john = new SpecsBox();
		john.color = "grey";
		SpecsBox kalvinClen = new SpecsBox();
		String color = "red";
		kalvinClen.color = "brown";
		System.out.println("kalvinClen " + kalvinClen.color);
		System.out.println(john.color);
	}

}
