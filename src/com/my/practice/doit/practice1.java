package com.my.practice.doit;

import java.util.*;

/*
 *	시간 복잡도
 *	알고리즘에서 수행 시간은 1억 번의 연산을 1초의 시간으로 간주하여 예측 
 *	- 유형
 *		1. 빅 오메가 Ω(n): 최선일 때(best case)의 연산 횟수를 나타내는 표기법
 *		2. 빅 세타 Θ(n): 보통일 때(average case)의 연산 횟수를 나타내는 표기법
 *		3. 빅 오 O(n): 최악일 때(worst case)의 연산 횟수를 나타내는 표기
 *	
 *	데이터 크기가 클수록 빠른순 
 *	O(n!) < O(2ⁿ) < O(n²) < O(nlogn) < O(n) < O(logn)
 *
 *알고리즘이나 개발을 할 때는 항상 최악일 때를 염두해 둬야 한다.
 *
 *	연산 횟수 = 알고리즘 시간 복잡도 * 데이터 크기 
 *
 *	0. N개의 개수가 주어졌을 때 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
public class practice1 {
	
	public static void main(String[] args) {
		solution(10);
	}
	
	
	public static void solution(int number) {
		int[] arr = new int[number];
		
		
		System.out.println("첫 배열 값");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 9);
			System.out.print(arr[i] +" ");
		}
		
		Arrays.sort(arr);
		
		System.out.println();
		System.out.println("정렬 후 배열 값");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
}
