package com.kh.basic;

public class Person {

	String name;
	int age;
	char gender;
	
	
	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * 소개하는 메소드
	 * => 저장된 이름, 나이, 성별 정보 출력
	 */
	
	// 접근 제한자 / 예약어 / 반환형 / 메소드명(매개변수) {
	//		실행할 내용
	// }
	
	public void introduce() {
		System.out.println(this.name + "," + this.age + "," + this.gender);
		
	}
	/**
	 * 말하다
	 * => "안녕하세요" 출력
	 */
	public void talk() {
		System.out.println("안녕하세요");
	}
	
	/**
	 * 울다
	 * => "엉엉"출력
	 */
	public void cry() {
		System.out.println("엉엉");
	}
}
