package com.kh;
import java.util.Scanner;

public class A_ArrayBasic {

	public static void main(String[] args) {
		int[] arr;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		arr = new int[n];
		
		for (int i=0 ; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]);
		}
		sc.close();

	}

}
