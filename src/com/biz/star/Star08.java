package com.biz.star;

public class Star08 {
	
	public static void main(String[] args) {
		
		addNum();
		addNum(30);
		addNum(8);
		addNum(3,4);
	}

	public static void addNum() {
		System.out.println("매개변수가 없는 method");
	}
	
	public static void addNum(int intNum) {
		if(intNum>10) {
			System.out.println("10보다 큰 값의 매개변수");
		}else {
			System.out.println("10이하의 매개변수");
		}
	}
	
	public static void addNum(int intNum1, int intNum2) {
		System.out.println(intNum1+intNum2);
	}
}
