package com.kh.access;
/**
 * 접근 제한자 : 클래스 및 클래스 내부 멤버(변수, 메소드)의 접근 권한을 제한
 * 
 * 1. 클래스에 사용 가능한 접근 제한자
 * 		=> public : 다른 패키지에서도 제한 없이 사용가능
 * 		=> default : 같은 패키지 내에서만 사용 가능
 * 
 * 2. 멤버(변수, 메소드)에 사용 가능한 접근 제한자
 * 		=> public : 어디서든 접근 가능
 * 		=> protected : 같은 패키지 내, 또는 상속관계면 접근 가능
 * 		=> default : 같은 패키지 내에서만 접근 가능
 * 		=> private : 같은 클래스 내부에서만 접근 가능(외부 접근 x)
 * 
 * 접근 가능 범위
 * public > protected > default > private 
 */

// 클래스 접근 제한자 : public -> 어디서나 해당 클래스를 인스턴스화 할 수 있음

public class AccessTest {
	// --- 필드부(변수부) : 접근제한자 / 예약어 / 자료형 / 변수명;
	public String publicField = "public 필드";
	protected String protectedFiled = "protected 필드";
	String defaultFiled = "default 필드";
	private String privateFiled = "private 필드";
	
	public void publicMethod() {
		System.out.println("public 메소드");
	}
	
	protected void protectedMethod() {
		System.out.println("protected 메소드");
	}
	void defaultMethod() {
		System.out.println("default 메소드");
	}
	private void privateMethod() {
		System.out.println("private 메소드");

	}
}
