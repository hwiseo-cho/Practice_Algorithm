package com.my.practice.algo2;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String str = String.valueOf(new Fibonacci1().solution(n)) + " '";
		int result = new Fibonacci1().solution(n);
		
	}
//	101
	public int solution(int n) {
		if(n == 0) {
			System.out.print("0");
			return 0;
		} else if(n == 1) {
			System.out.print("1");
			return 1;
		} else {
			return solution(n-1) + solution(n-2);
		}
	}
}
