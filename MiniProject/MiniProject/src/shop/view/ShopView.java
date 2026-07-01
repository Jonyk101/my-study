package shop.view;

import java.util.Scanner;

import shop.controller.ShopController;

public class ShopView {
	
	
	public void shopMenu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== 쇼핑몰 로그인/회원가입 =====");
			System.out.println("[1] 로그인 하기");
			System.out.println("[2] 회원가입 하기");
			System.out.println("[3] 서비스 종료하기");
			System.out.println("");
			System.out.print("이용할 메뉴를 입력해주세요: ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
				case 1: break;
					// login();
				case 2: break;
					// join();
				case 3:
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요");
					break;
			}
			
			sc.close();
		}
	}
}
