package com.biz.star;

public class Star07 {
	
	public static void main(String[] args) {
		
		calcNum(30,40);
		calcNum(50,20);
		calcNum(100,200);
		calcNum(3,100);
		calcNum(5,20);
		
		
	}
	
	public static void cal(int num1, int num2) {
		
		int sum = num1+num2;
		int mul = num1*num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " x " + num2 + " = " + mul);
	}

	public static void calcNum(int intNum1, int intNum2) {
		
		System.out.printf("%d + %d = %d\n",intNum1,intNum2,intNum1+intNum2);
		System.out.printf("%d x %d = %d\n",intNum1,intNum2,intNum1*intNum2);
	}
}
