package com.kh.access.run;
import com.kh.access.AccessTest;

public class Run {
	public static void main(String[] args) {
		AccessTest test = new AccessTest();
		
		System.out.println(test.publicField);
		test.publicMethod();
		
//		System.out.println(test.protectedFiled);
		
//		String str = test.defaultFiled;
//		test.defaultMethod();

	}

}
