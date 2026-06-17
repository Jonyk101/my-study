package com.kh;

public class B_ArrayFeatures {

	public static void main(String[] args) {
		int [] iArr = new int[10];
		double[] dArr = new double[4];
		
		for (int i=0 ; i<iArr.length ; i++) {
			
			System.out.println(iArr[i]);
		}
		
		System.out.println("------------------");
		
		for (int i=0 ; i<dArr.length ; i++) {
			
			System.out.println(dArr[i]);
		}
		System.out.println("------------------");
		System.out.println(iArr);
		System.out.println(dArr);
		// 결과값 => 배열의 자료형 + @ 주소값(16진수)
		
		int [] arr;
		arr = new int[5];
		System.out.println("재할당 전 : " + arr);
		arr = new int[7];
		System.out.println("재할당 후 : " + arr);

	}

}
