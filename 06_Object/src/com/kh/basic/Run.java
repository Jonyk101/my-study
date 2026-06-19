package com.kh.basic;


public class Run {
	/**
	 * 객체 생성 및 사용법
	 * 
	 * - 변수 선언(참조 변수 공간 확보)
	 *		클래스명 변수명;
	 *
	 * - 객체 생성 및 할당(메모리에 실제 객체를 올리고 주소 연결)
	 * 		// 생성
	 * 			new 생성자; // new 클래스명(); -> 기본 생성자
	 * 		// 할당
	 * 			변수명 = new 생성자;
	 * 
	 * - 선언과 할당 동시에
	 * 		클래스명 변수명 = new 생성자;
	 * 
	 * - 객체 멤버(변수, 메소드) 접근하기 : 연결 연산자(.) 사용
	 * 	=> 멤버 변수 접근 : 참조변수.멤버변수
	 * 	=> 멤버 메소드 호출 : 참조변수.메소드명()
	 * 
	 * - 생성자 활용 참고
	 * 	=> 기본 생성자 사용 -> 멤버 변수 값을 나중에 하나하나 저장 (우선, 각 자료형의 기본값으로 채워짐)
	 * 	=> 매개변수가 있는 생성자 사용 -> 객체를 만들면서 동시에 특정 값을 바로 저장
	 */

	public static void main(String[] args) {
		Person p1;  //선언만 했을 경우 => null 값을 가지고 있을 것이다.
		
		p1 = new Person();
		
		// 이름, 나이, 성별에 값을 저장(대입)
		p1.name = "김종혁";
		p1.age = 26;
		p1.gender = 'M';
		
		p1.introduce();
		
		Person p2 = new Person("아무개", 24, 'M');
		
		Person p3 = new Person("장재영");
		p3.age = 25;
		p3.gender = 'M';
		
		p2.introduce();
		p3.introduce();

	}

}
