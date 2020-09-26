package com.my.practice.algo1;

import java.util.Scanner;

/*
	쉬운거부터 시작
	공배수 구하기
*/
public class Prac1 {

	Scanner sc = new Scanner(System.in);
	
	public void p1() {
		System.out.println("입력:");
		int a = sc.nextInt();
		System.out.println("입력:");
		int b = sc.nextInt();
		
		for (int i = 1; i <= a && i <= b; i++) {
			if((a%i) == 0 && (b%i) == 0) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new Prac1().p1();
	}
}
