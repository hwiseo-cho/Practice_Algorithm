package com.my.practice.doit;

import java.util.*;

/*
 *	1. 배열과 리스트 
 *
 *	- 배열
 *		1. 메모리의 연속된 공간에 값이 채워져 있는 형태의 자료구조
 *		2. 배열의 값은 인덱스로 참조, 선언한 자료형 값만 저장 
 *		3. 특정 위치에 새로운 값 삽입, 삭제 어려움(주변 인덱스들을 이동해주는 작업 필요)
 *
 *	- 리스트
 *		1. 값과 포인터를 묶은 노드라는 것으로 연결한 자료구조
 *		2. 인덱스가 없어 head포인터 부터 순차적으로 접근해야함
 *		3. 새로운 값 삽입, 삭제하는데 용이하다.(앞뒤 포인터만 끊어서 새로 연결해주면 되기 때문)
 *		4. 저장공간은 복잡, 크기 선언 X
 *
 *	001. N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
 *
 *	002. N개의 과목의 개수에 각 점수를 점수/최대값M * 100	형태로 점수를 내어 평균을 구하라 
 */
public class practice2 {
	
	public static void main(String[] args) {
		//solution001();
		solution002();
	}
	
	public static void solution001() {
		Scanner sc = new Scanner(System.in);
		
		// N개의 
		int n = sc.nextInt();
		// 공백없이 써 있는 N개의 
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			result += Integer.parseInt(String.valueOf(arr[i]));
		}
		
		System.out.println(result);
	}
	 
	public static void solution002() {
		Scanner sc = new Scanner(System.in);
		
		// N개의 과목 
		int n = sc.nextInt();
		// 각 과목의 점수
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		// 수학적 접근 필요
		// a/M*100 + b/M*100 + c/M*100 / N = (a+b+c)*100 / M / N
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		
		System.out.println(sum * 100.0 / max / n);
	}
	
}
