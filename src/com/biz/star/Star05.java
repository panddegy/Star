package com.biz.star;

public class Star05 {
	
	public static void main(String[] args) {
		
		triAngle();
		verTriAngle();
		for(int i=0; i<5; i++) {
			triAngle();
		}
	}
	
	public static void triAngle() {
		
		for(int j=0; j<5; j++) {
			for(int i=j; i<5; i++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void verTriAngle() {
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<j; i++) {
				System.out.print(" ");
			}
			for(int k=j; k<5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
