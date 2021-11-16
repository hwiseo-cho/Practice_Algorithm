package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다. 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
 
 */
public class practice10 {
	
	public static void main(String[] args) {
		String s = "cdcd";
		System.out.println(solution(s));
	}
	
	
	 public static int solution(String s) {
		 Stack<Character> stack = new Stack<>();
         
         for(char c : s.toCharArray()) 
           if(!stack.isEmpty() && stack.peek() == c) stack.pop();
           else stack.push(c);
         
         return stack.isEmpty() ? 1 : 0;
	 }
	
	
	// 내꺼
	public static int mySolution(String s) {
		Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) 
          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
          else stack.push(c);
        
        return stack.isEmpty() ? 1 : 0;
	}
		
}
