package com.kh;
import java.util.Scanner;

public class C_Logical {
	/*
	 * 논리 연산자
	 * -> 논리값을 연산 (true, false)
	 * 종류
	 * &&(AND)
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * ||(OR)
	 * true || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 * SCE (단축평가) => 논리 연산자에서 뒤의 조건을 보지 않아도 결과값이 동일할때 연산을 실행하지 않는것
	 * &&(AND) 일 때, 앞의 조건이 false 라면 뒤의 조건은 실행 X
	 * ||(OR) 일 때, 앞의 조건이 true 라면 뒤의 조건은 실행X
	 */

	public static void main(String[] args) {
		//method1();
		method2();
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		int n1;
		boolean result1, result2;
		
		System.out.print("정수를 입력하세요: ");
		n1 = sc.nextInt();
		
		result1 = (n1 >= 1) && (n1 <= 10);
		result2 = (n1 < 1) || (n1 > 10);
				
		System.out.println("입력된 값은 1~10 사이의 값인가? " + result1);
		System.out.println("입력된 값은 1~10 범위를 벗어나는가? " + result2);
		
		sc.close();
		
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		char chr;
		boolean result;
		
		System.out.print("문자를 입력하세요: " );
		chr = sc.next().charAt(0);
		result = (chr >= 97) && (chr <= 122);
		// result = (chr >= 'a') && (chr <= 'z');

		System.out.print("입력받은 문자는 소문자인가? " + result);
		
		sc.close();
		 
	}

}
