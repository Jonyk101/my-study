package com.kh.ex1;
import java.util.Scanner;


public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		
		System.out.print("그리고 싶은 정사각형의 변의 길이를 알려주세요: ");
		r = sc.nextInt();
		
		System.out.println("정사각형 한변의 길이" + r);
		System.out.println("정사각형 둘레의 길이" + r*4);
		System.out.println("정사각형 한변의 길이" + r*r);
		
		sc.close();
	}

}
