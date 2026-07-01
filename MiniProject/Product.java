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

    public Product(String pName, String pCode, String category, int price, int pStock) {
        this.pName = pName;
        this.pCode = pCode;
        this.category = category;
        this.price = price;
        this.pStock = pStock;
    }

    public String getPCode() { return pCode; }
    public String getPName() { return pName; }
    public String getCategory() { return category; }
    public int getPrice() { return price; }
    public int getStock() { return pStock; }

    public boolean isSoldOut() {
        return pStock <= 0;
    }

    public void decreaseStock() {
        if (pStock > 0) {
            pStock--;
        }
    }

    @Override
    public String toString() {
        return pName + "_" + category + "_" + price + "원_재고:" + (isSoldOut() ? "품절" : pStock + "개");
    }
}