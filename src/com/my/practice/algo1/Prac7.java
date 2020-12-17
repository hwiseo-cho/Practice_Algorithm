package com.my.practice.algo1;

import java.util.Scanner;

/*
 *	금액을 입력하여 화폐 단위별로 화폐의 매수를 계산하는 순서도를 작성하시오.
	(단, 금액은 10,000원 이상이 입력되며, 화폐의 단위는 1원 권에서 50,000원 권 까지이다.)
 */
public class Prac7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력해주세요: ");
		int money = sc.nextInt();
		String result = new Prac7().solution(money);
		System.out.println("결과");
		System.out.println("-----------------");
		System.out.println(result);
	}
	
	public String solution(int m) {
		String result = "";
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		if(m >= 50000) {
			a = m/50000;
			m -= a*50000;
			result += "50000원: " + String.valueOf(a) + "매\n";
		}
		if(m >= 10000) {
			b = m/10000;
			m -= b*10000;
			result += "10000원: " + String.valueOf(b) + "매\n";
		}
		if(m >= 5000) {
			c = m/5000;
			m -= c*5000;
			result += "5000원: " + String.valueOf(c) + "매\n";
		}
		if(m >= 1000) {
			d = m/1000;
			m -= d*1000;
			result += "1000원: " + String.valueOf(d) + "매\n";
		}
		if(m >= 500) {
			e = m/500;
			m -= e*500;
			result += "500원: " + String.valueOf(e) + "매\n";
		}
		if(m >= 100) {
			f = m/100;
			m -= f*100;
			result += "100원: " + String.valueOf(f) + "매\n";
		}
		
		
		return result;
	}
}
