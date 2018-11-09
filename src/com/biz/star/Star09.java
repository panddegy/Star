package com.biz.star;

public class Star09 {
	
	public static void main(String[] args) {
		
		addVar(2,3);
		
	}
	
	public static void addVar() {
		System.out.println("숫자를 전달하지 않으면");
		System.out.println("계산을 할수 없습니다.");
	}
	public static void addVar(int intNum) {
		System.out.println("숫자 2개를 전달해야 합니다.");
	}
	public static void addVar(int intNum1, int intNum2) {
		System.out.printf("두개의 숫자 %d과(와) %d를 더하면 %d가 된다.\n",intNum1,intNum2,intNum1+intNum2);
	}
	

}
