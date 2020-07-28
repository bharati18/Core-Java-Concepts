package com.learn.enumeration;

public class EnumerationExample {

	private String name;
	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EnumerationExample [name=" + name + ", age=" + age + "]";
	}
	
	
}
