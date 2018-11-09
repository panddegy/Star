package com.biz.star;

public class Star06 {
	
	public static void main(String[] args) {
		
		triAngle(5);
		triAngle(7);
		triAngle(10);
	}
	
	public static void triAngle(int intStarCount) {
		
		// int intStarCount=5;
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
