package com.learn.enumeration;

public class Employee {
	private String name;
	private int age;
	private String designaton;

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

	public String getDesignaton() {
		return designaton;
	}

	public void setDesignaton(String designaton) {
		this.designaton = designaton;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", designaton=" + designaton + "]";
	}

}
