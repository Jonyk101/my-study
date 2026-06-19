package com.kh.ex2.run;
import com.kh.ex2.model.vo.Book;

public class Run {
	
	public static void main(String[] args) {
		Book bk1 = new Book();
		
		bk1.setTitle("객제지향의 사실과 오해");
		bk1.setPublisher("위키북스");
		bk1.setauthor("조영호");
		bk1.setPrice(25000);
		bk1.setdiscountRate(0.1);
		
		Book bk2 = new Book("클린 코드", "인사이트", "로버트 c. 마틴 ");
		bk2.setPrice(38000);
		bk2.setdiscountRate(0.15);
		
		Book bk3 = new Book("실용주의 프로그래머", "인사이트", "앤드류 헌트, 데이비드 토마스", 35000, 0.15);
		
		bk1.inform();
		bk2.inform();
		bk3.inform();
	
	}

}
