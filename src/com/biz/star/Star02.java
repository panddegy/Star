package com.biz.star;

public class Star02 {
	
	public static void main(String[] args) {
				
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=========");
		
		for(int j=0; j<5; j++) {
			for(int i=j; i<5; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=========");
		
		for(int j=0; j<5; j++) {
			for(int i=j; i<5; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=========");
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	