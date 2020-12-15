package com.my.practice.algo1;

import java.util.Scanner;

/*
 * 	임의의 두 수의 최소공배수 최대공약수 구하기
 */
public class Prac6 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*50)+1;
		int b = (int)(Math.random()*50)+1;
		
		int result1 = 0;
		int result2 = 0;
		int num = 0;
		
		if(a > b) {
			num = a;
		} else {
			num = b;
		}
		for (int i = num; i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				result1 = i;
				result2 = (a*b)/i;
				break;
			} else {
				result1 = i;
				result2 = a*b;
			}
		}
		System.out.println("값1: " + a + "\n" + "값2: " + b);
		System.out.println("최대 공약수: " + result1);
		System.out.println("최소 공배수: " + result2);
	}
	
}
