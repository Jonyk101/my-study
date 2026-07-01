package shop.model;

import java.util.Scanner;
import java.time.LocalDate;

public class Product {
	private String pName;	//제품 이름 (ex: 헨리넥 티셔츠) 
	private String pCode;	//제품 코드 / 해당 코드는 계절, 카테고리 등을 받아서 조합하여 만든다.
	private String category;
	private int price;	//제품 가격
	private int pStock;	// 재고
	private LocalDate postDate; //제품 등록일 (등록된 날짜별로 보고싶은 경우를 생각해서)
	
	public boolean isSoldOut() {
		if (pStock == 0) {
			System.out.println("해당 상품은 현재 재고부족으로 품절입니다.");
			return true;
		}
		return false;
	}
	
	public void decreaseStock() {
		pStock--;
	}
	
}
