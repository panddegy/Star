package com.biz.star;

public class Test02 {
	
	public static void main(String[] args) {
		
		int ar[]= {8,2,3,12,5};
		int max = maxValue(ar);
		minValue(ar);
		maxValue(ar);
		System.out.println(max);
	}

	public static void minValue(int ar[]) {
		
		int minValue=ar[0];
		for(int i=1; i<ar.length; i++) {
			if(minValue>ar[i]) minValue=ar[i];
		}
		System.out.println(minValue);
	}
	
	public static int maxValue(int ar[]) {
		
		int maxValue=ar[0];
		for(int e:ar) {
			if(maxValue<ar[e]) maxValue=ar[e];
		}
		return maxValue;
		
	}
}
