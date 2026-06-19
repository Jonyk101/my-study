package com.kh.ex1.run;
import com.kh.ex1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pd1 = new Product();
		Product pd2 = new Product();
		
		
		pd1.setProductName("아이폰 17");
		pd1.setPrice(1000000);
		pd1.setBrand("애플");
		
		pd2.setProductName("갤럭시 S26 울트라");
		pd2.setPrice(1350000);
		pd2.setBrand("삼성");

		
		pd1.information();
		pd2.information();

	}

}
