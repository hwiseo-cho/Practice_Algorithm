package com.my.practice.programmers2;

import java.util.*;
import java.util.stream.LongStream;

/*
 *	 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
	알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.
 */
public class practice3 {
	
	public static void main(String[] args) {
	//	String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id = "aaaaaaaaaaaaaaaa";
		System.out.println(solution(new_id));
	}
	
	
	public static String solution(String new_id) {
		String answer = "";
		
		new_id = new_id.toLowerCase();
		char[] arr = new_id.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLetterOrDigit(arr[i]) || arr[i] == '-' || arr[i] == '_' || arr[i] == '.') {
				answer += arr[i];
			}
		}
		
		Stack<Character> stack = new Stack<>();
		arr = answer.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				stack.add(arr[i]);
			} else {
				if(stack.peek() == '.' && stack.peek() == arr[i]) {
					continue;
				} else {
					stack.add(arr[i]);
				}
			}
		}
		int i = 0;
		answer = "";
		for(Character s : stack) {
			if(i == 0 && s == '.') {
				continue;
			} else if(i == stack.size()-1 && s == '.') {
				continue;
			} else {
				answer += s;
			}
			i++;
		}
		if(answer.startsWith(".")) {
			answer = answer.substring(1, answer.length()-1);
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length()-1);
		}
		if(answer.replaceAll(" ", "").equals("")) {
			answer = "a";
		}

		if(answer.length() > 15) {
			answer = answer.substring(0, 15);
			if(answer.endsWith(".")) {
				answer = answer.substring(0, answer.length()-1);
			}
		}
		
		if(answer.length() <= 2) {
			while(answer.length() <= 2) {
				answer += answer.substring(answer.length()-1,answer.length());
			}
		}
		
		
		
		return answer;
    }
    
 
	// 내꺼
	public static String mySolution(String new_id) {
		String answer = "";
		
		new_id = new_id.toLowerCase();
		char[] arr = new_id.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLetterOrDigit(arr[i]) || arr[i] == '-' || arr[i] == '_' || arr[i] == '.') {
				answer += arr[i];
			}
		}
		
		Stack<Character> stack = new Stack<>();
		arr = answer.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				stack.add(arr[i]);
			} else {
				if(stack.peek() == '.' && stack.peek() == arr[i]) {
					continue;
				} else {
					stack.add(arr[i]);
				}
			}
		}
		int i = 0;
		answer = "";
		for(Character s : stack) {
			if(i == 0 && s == '.') {
				continue;
			} else if(i == stack.size()-1 && s == '.') {
				continue;
			} else {
				answer += s;
			}
			i++;
		}
		if(answer.startsWith(".")) {
			answer = answer.substring(1, answer.length()-1);
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length()-1);
		}
		if(answer.replaceAll(" ", "").equals("")) {
			answer = "a";
		}

		if(answer.length() > 15) {
			answer = answer.substring(0, 15);
			if(answer.endsWith(".")) {
				answer = answer.substring(0, answer.length()-1);
			}
		}
		
		if(answer.length() <= 2) {
			while(answer.length() <= 2) {
				answer += answer.substring(answer.length()-1,answer.length());
			}
		}
		
		
		
		return answer;
	}

		
		
}
