package com.my.practice.algo1;

import java.util.Scanner;

public class prac2 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new prac2().view();
	}
	
	public void view() {
		
		System.out.println("____________저 녁 고 르 기___________");
		System.out.println("1. 집밥");
		System.out.println("2. 치킨");
		System.out.println("3. 일식");
		System.out.println("4. 중식");
		System.out.println("고르기 ㄱㄱ? (예: 1, 아니오: 2)");
		int select = sc.nextInt();
		
		if(select == 1) {
			int result = 0;
			result = (int)(Math.random()*4)+1;
			
			switch(result) {
			case 1: System.out.println("집밥!"); break;
			case 2: System.out.println("치킨!"); break;
			case 3: System.out.println("일식!"); break;
			case 4: System.out.println("중식!"); break;
			default: System.out.println("다시~"); break;
			}
		}
	}
}
