package com.kh.ex1;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		float height;
		
		
		System.out.print("탑승자의 나이를 입력해주세요: ");
		age = sc.nextInt();
		
		System.out.print("탑승자의 키를 입력해주세요: ");
		height = sc.nextFloat();
		
		System.out.print("");
		System.out.println("-------------------------------");
		System.out.println("현재 탑승자의 나이: " + age);
		System.out.println("현재 탑승자의 키: " + height);
		String result = age >= 12 && height >= 130 ? "단독 탑승 가능" : "보호자 동반 필수";
		System.out.println(result);
		
		sc.close();

	}

}
