package com.learn;

import java.util.Scanner;

public class AdditionProgram {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		int add;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a");
		int a= sc.nextInt();
		System.out.println("enter the value of b");
		int b= sc.nextInt();
		add=a+b;
		System.out.println("add = "+ add);
		
	}
}
