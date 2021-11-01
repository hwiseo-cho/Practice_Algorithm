package com.my.practice.programmers1;

import java.util.*;

/*
 *	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 */
public class practice5 {
	
	public static void main(String[] args) {
		String s = "one4seveneight";
		
		System.out.println(solution(s));
	}
	
	
	public static int solution(String s) {
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};

		for(int i=0; i<arr.length; i++) {
			s = s.replaceAll(arr[i], Integer.toString(i));
		}
        return Integer.parseInt(s);
	}
	
	
	// 내꺼
	public static int mySolution(String s) {
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};

		for(int i=0; i<arr.length; i++) {
			s = s.replaceAll(arr[i], Integer.toString(i));
		}
        return Integer.parseInt(s);
	}
		
}
