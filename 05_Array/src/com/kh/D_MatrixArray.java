package com.kh;

public class D_MatrixArray {
	/*
	 * 2차원 배열 : 배열 안에 배열이 있는 형태
	 * 			"같은" 자료형으로 구성된 "1차원 배열의 묶음"
	 * 
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 2개가 부여됨( 행과 열 )
	 * 	: 앞의 인덱스는 행의 인덱스 (몇번째 배열인지),
	 * 	  뒤의 인덱스는 열의 인덱스 (1차원 배열에서 몇 번째 위치의 데이터인지)
	 * 
	 * 선언
	 * => 자료형 [][] 변수명; "해당 방식을 권장함."
	 * => 자료형 변수명 [][]; "가끔 그럴 수 있음."
	 * => 자료형[] 변수명[] <- 해도 되나 보기 어려울 수 있음!
	 * 
	 * 할당
	 * => 변수명 = new 자료형[행의 크기][열의 크기]
	 * 			=> 행의 크기 : 1차원 배열의 개수 "배열을 몇개나 만들것인가?"
	 * 			=> 열의 크기 : 배치될 1차원 배열의 크기 "각 배열마다 얼마나 데이터를 넣을 것인가?" (생략가능)
	 * 
	 *  선언 및 할당
	 *  => 자료형[][] 변수명 = new 자료형[행크기][열크기]; "권장"
	 *  
	 *  값 대입
	 *  => 변수명[행 인덱스][열 인덱스] = 값;
	 *  		=> 행 인덱스 : 몇 번째 1차원 배열인지
	 *  		=> 열 인덱스 : 1차원 배열에서 몇 번째 위치인지
	 *  
	 *  초기화
	 *  => 자료형[][] 변수명 = { 1차원_배열, 1차원_배열, ...};
	 *  => 자료형[][] 변수명 = {{값, 값, 값}, {값, 값, 값,}, ...};
	 *  => 자료형[][] 변수명 = { new 자료형[크기], new 자료형[크기], ...};
	 */

	public static void main(String[] args) {
		method1();

	}
	
	public static void method1() {
		int[][] arr;
		// arr = new int[3][4];
		arr = new int[3][];
		/*
		arr[0] = new int[4];		
		arr[1] = new int[4];
		arr[2] = new int[4];
		*/
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = new int[4];
		}
		
		// arr[0].length => 4. 열의 크기 해당 인덱스 위치의 1차원 배열의 크기
		/*
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);
		*/
		// 반복문을 이용한 출력
		// i => 행 인덱스 0~행크기 -1
		// ㅓ => 열 인덱스 0~열크기 -1
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
			

		}
		//값 대입
		//초기화 => {} (arr2 배열)
		
		int[][] arr2 = { 
						{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12}
						};
		// arr2 배열에서 7을 출력
		System.out.print("arr2[1][2] : " + arr2[1][2]);
		
	}

	public static void method2() {
		
	}
}
