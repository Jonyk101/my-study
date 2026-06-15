package com.kh;

public class A_Arithmetic {
	/*
	 * 산술연산자
	 * --> +, -, *, /(몫), %(나머지) : 우선순위는 사칙연산의 순위를 따라감
	 * 
	 */
	public static void main(String[] args) {
		// method1();
		method2();

	}
	public static void method1(){
		int n1, n2;
		n1 = 10;
		n2 = 3;
		
		System.out.println("n1 + n2 = "+ (n1 + n2));
		System.out.println("n1 - n2 = "+ (n1 - n2));
		System.out.println("n1 + n2 = "+ (n1 * n2));
		System.out.println("n1 + n2 = "+ (n1 / n2));
		System.out.println("n1 + n2 = "+ (n1 % n2));
	}
	public static void method2(){
		int a, b, c, d, e, f, g, h, i;
		a = 5;
		b = 10;
		c = ++a + b; // c => ++a (6) + b(10) = 16 현재 c에는 16이 저장되어 있음.

		d = c / a; // 2
		e = c % a; // 4
		f = e++; // 4, e에는 현재5
		g = --b + d--; // 11 
		h = 2;
		i = a++ + b / (--c /f) * (g-- - d) % (++e + h); 
		// 6 + 9 / (15/4) * (11-1) % (6+2)
		// 6 + 9 / 3 * 10 % 8
		// 6 + 3 * 10 % 8
		// 6 + 30 % 8
		// 6 + 6 = 12
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}


}
