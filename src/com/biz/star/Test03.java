package com.biz.star;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		calcNum(a,b);
		sc.close();
	}
	
	public static void calcNum(int a, int b) {
		System.out.println(a*b);
	}
}
