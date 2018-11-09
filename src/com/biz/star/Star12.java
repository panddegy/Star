package com.biz.star;

public class Star12 {
	
	public static void main(String[] args) {
		
		triAngle(3);
		
		for(int i=5; i<20; i++) {
			triAngle(i);
		}
	}
	
	public static void triAngle(int intStarCount) {
		
		for(int j=0; j<intStarCount; j++) {
			for(int i=j; i<intStarCount; i++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
