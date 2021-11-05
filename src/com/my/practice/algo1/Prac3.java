package com.my.practice.algo1;

import java.util.Scanner;

/*
 *	2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567로 
 *	나눈 나머지를 리턴하는 함수 solution을 완성해 주세요 
 *	단, n은 1이상 100000이하
 *	파보나치수: 0, 1, 1, 2, 3, 5 ....
 */

public class Prac3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: "); 
		int n = sc.nextInt();
		int result = new Prac3().solution(n);
		if(result == -1) {
			System.out.println("2 이상의 자연수를 입력해주세요");
		} else {
			System.out.println("결과: " + result);
		}
	}
	
	public int solution(int n) {
		if(n < 2) {
			return -1;
		} else {
			
			return n;
		}
		
	}
}
