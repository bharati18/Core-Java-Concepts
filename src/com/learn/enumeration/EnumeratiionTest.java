package com.learn.enumeration;

public class EnumeratiionTest {

	public static void main(String[] args) {

		EnumerationExample ee = new EnumerationExample();
		ee.setAge("25");
		ee.setName("esha");
		System.out.println(ee);
		System.out.println("age " + ee.getAge());
		System.out.println("name" + ee.getName());
		// make below
		Employee em = new Employee();
		em.setAge(25);
		em.setDesignaton("software engg");
		em.setName("esha");
		System.out.println(em.toString());
		System.out.println("age" +em.getAge());
		System.out.println("name" +em.getName());
		System.out.println("designation" +em.getDesignaton());
		
	}
}
