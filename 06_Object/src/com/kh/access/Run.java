package com.kh.access;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성 및 할당
		
		AccessTest test = new AccessTest();
		
		String pf = test.publicField;
		System.out.println("public 변수 : " + pf);
		
		test.publicMethod();
		
		String ptf = test.protectedFiled;
		System.out.println("protected 변수 : " + ptf);
		
		test.protectedMethod();
	
		
		System.out.println(test.defaultFiled);
		
		test.defaultMethod();
		
		



	}

}
