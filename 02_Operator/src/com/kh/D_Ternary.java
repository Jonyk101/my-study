package com.kh;
import java.util.Scanner;

public class D_Ternary {
	/*
	 * 삼항연산자 
	 * 
	 * -> ____ ? __________ : __________ 
	 * -> 조건식 ? TRUE인 경우 : FALSE인 경우
	 */

	public static void main(String[] args) {
		//method1();
		method2();

	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시겠습니까? (x를 입력해주세요): ");
		char chr = sc.next().charAt(0);
		
		String result = (chr == 'x' || chr == 'X') ? "종료합니다" : "계속 진행합니다."; 
		System.out.println(result);
		
		sc.close();
	}
	
	public static void method2() {
		/*
		 * 사용자에게 두개의 정수와 + 또는 - 를 입력받아 연산 결과 출력
		 * 단 + 또는 - 외의 문자가 입력되면 입력이 잘못 되었습니다. 출력
		 */
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		

		System.out.print("첫번쨰 정수를 입력해주세요: ");
		n1 = sc.nextInt();
		
		System.out.print("두번쨰 정수를 입력해주세요: ");
		n2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요: ");
		char str = sc.next().charAt(0);
		
		String result = str == '+' || str == '-' ? (str == '+' ? "n1 + n2 : " + (n1+n2) : "n1 - n2 : " + (n1-n2)) : "입력이 잘못되었습니다.";
		// String result = (str == '+') ? ("n1 + n2 = " + (n1 + n2)) : (str == '-') ? "n1 - n2 =" + (n1 - n2) : "입력이 잘못되었습니다.";
		System.out.println(result);
		
		sc.close();
		
	}

}
