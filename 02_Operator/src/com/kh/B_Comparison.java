package com.kh;
import java.util.Scanner;

public class B_Comparison {
	/*
	 * 비교 연산자
	 * 조건을 만족하는지에 따라 true, false
	 * 종류
	 * -> 대소 비교 연산자 : < , > , <= , >=
	 * -> 동등 비교 연산자 : == !=
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2; 
		
		System.out.print("정수1 입력 : " );
		n1 = sc.nextInt();
		
		System.out.print("정수2 입력 : " );
		n2 = sc.nextInt();
		
		System.out.println("정수 1과 정수2는 같은 값은가? : " + (n1 == n2));
		System.out.println("정수 1이 정수 2보다 큰가? : " + (n1 > n2));
		System.out.println("정수 2는 짝수인가? : " + (n2 % 2 == 0));
		System.out.println("정수 2는 'A'의 유니(아스키)코드 인가? : " + (n2 == 'A'));
		
		sc.close();

	}


}
