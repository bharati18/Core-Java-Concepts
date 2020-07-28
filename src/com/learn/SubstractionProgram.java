package com.learn;

import java.util.Scanner;

public class SubstractionProgram {

	public static void main(String[] args) {
		int subb;
		System.out.println("enter the value of a");
		System.out.println("enetr the value of b");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int div = a / b;
		int sub = a - b;
		int multi = a * b;
		int mod = a % b;
		System.out.println("subb=" + sub);
		System.out.println("div=" + div);
		System.out.println("multi=" + multi);
	}

}
