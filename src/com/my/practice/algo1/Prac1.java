package com.my.practice.algo1;

import java.util.Scanner;

/*
	함수 solution은 정수 n을 매개변수로 입력받습니다.
	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	단, n은 1이상 8000000000이하
	ex) 118372 -> 873211 로 리턴
*/
public class Prac1 {
	
	String res;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println("변경 전: "+ num);
		System.out.println("변경 후: " + new Prac1().solution(num));
	}
	
	public int solution(int num) {
		String str = String.valueOf(num);
		res = "";
		str.chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
		
		return Integer.parseInt(res);
	}
}
