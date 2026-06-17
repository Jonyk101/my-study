package com.kh;

public class C_ArrayCopy {

	public static void main(String[] args) {
		// shallowCopy();
		deepCopy();

	}
	/**
	 * 얕은 복사 : 주소값을 복사하는 방식
	 */
	public static void shallowCopy() {
		int[] origin = new int[] {1, 2, 3, 4, 5};
		// int[] origin = {1, 2, 3, 4, 5}; <- 이렇게도 가능! 
		
		System.out.println("===== 원본 배열 출력 ====");
		
		for (int i=0 ; i<origin.length ; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		System.out.println("===== 복사본 배열 출력 ====");

		
		int[] copy;
		copy = origin;
		
		for (int i=0 ; i<copy.length ; i++) {
			System.out.print(copy[i] + " ");

		}
		
		System.out.println();
		System.out.println("===== 복사본2 배열 출력 ====");
		copy[2] = 333;
		for (int i=0 ; i<copy.length ; i++) {
			System.out.print(copy[i] + " ");

		}
		System.out.println();
		
		System.out.println("===== 원본2 배열 출력 ====");
		
		for (int i=0 ; i<origin.length ; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		
	}
	/**
	 * 깊은 복사 : 새로운 배열을 생성하여 원본 배열의 값을 복사하는 방식
	 */
	public static void deepCopy() {
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		System.out.println("=== 데이터 복사 전 copy 배열 === ");
		// for (자료형 변수명 : 배열명){ 변수명 }
		// 			=> 배열의 첫번째 위치부터 마지막 위치까지 순차적으로 접근
		
		for (int item : copy) { 
			System.out.print(item + " ");
		}
		System.out.println();
		
		// [1] 반복문 사용하여 복사하기
		// 		초기식에 선언한 변수를 인덱스로 활용
		
		for (int i=0 ; i < origin.length ; i++) {
			// 복사본 배열 = 원본 배열
			// 복사본 배열의 i 번째 위치 = 원본 배열의 i 번째 위치값
			copy[i] = origin[i];
		}
		
		origin[0] = 999;
		
		System.out.println("=== 데이터 복사 후 copy 배열 === ");
		for (int data : copy) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("=== origin 배열 === ");
		for (int data : origin ) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		// --------------------------------------------------
		// System.arraycopy(원본배열명, 복사를 시작할 인덱스,
//								복사본배열명, 복사본배열의 시작인덱스, 복사할개수);
		// System.arraycopy(origin, 0, copy, 0, origin.length);
		
		copy = new int[10];
		
		System.arraycopy(origin, 2, copy, 4, 3);
		
		
		
		System.out.println("===== arraycopy로 복사 =====");
		for(int n : copy) {
			System.out.print(n + " ");
		}

		
		
	}
}
