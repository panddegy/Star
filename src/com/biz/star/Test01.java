package com.biz.star;

public class Test01 {

	public static void main(String[] args) {
		
		int num1 =3;
		int num2 =0;
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<10; i++) {
				if(i<(num1+num2) && (num1-num2)<i) {
					System.out.print("* ");
				} else System.out.print("  ");
			}
		System.out.println();
		num2++;
		}
		
		int num3=2;
		int num4=1;
		for(int j=0; j<5; j++) {
			for(int i=0; i<num3; i++) {
				System.out.print("  ");
			}
			for(int k=0; k<num4; k++) {
				System.out.print("* ");
			}
			System.out.println();
			if(num3>0)num3--;
			else num3++;
			if(num4<3)num4+=2;
			else num4-=2;
		}
	}
}

















	
