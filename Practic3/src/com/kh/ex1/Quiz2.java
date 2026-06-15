package com.kh.ex1;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pay, price, a, b;
		
		System.out.print("구매할 물건의 가격을 입력해주세요: ");
		price = sc.nextInt();
		
		System.out.print("내실 돈을 입력해주세요: ");
		pay = sc.nextInt();
		
		a = ((pay-price)/1000);
		b = ((pay-price)%1000);
		
		System.out.println("");
		System.out.println("지불한 금액: " + pay);
		System.out.println("물건 가격: " + price);
		System.out.println("--- 거스름돈 내역 ---");
		System.out.println("천원 지폐: " + a);
		System.out.println("100원 동전: " + b);
		
		sc.close();
		
	}

}
