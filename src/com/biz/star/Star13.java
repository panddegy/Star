package com.biz.star;

public class Star13 {
	
	public static void main(String[] args) {
		
		for(int i=5; i<10; i++) {
			triAngle(i);
		}
	}

	public static void triAngle(int intStarCount) {
		
		if(intStarCount>5) {
			System.out.println("nope");
			return;
		}
		
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
