package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
 */
public class practice14 {
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
	
	
	public static String solution(int n) {
		String[] numbers = {"4", "1", "2"};
	    String answer = "";
	      
	    int num = n;
	      
	    while(num > 0){
	       int temp = num % 3;
	       num /= 3;
	          
	       if(temp == 0) num--;
           answer = numbers[temp] + answer;
	    }
	      
	    return answer;
    }
	
	
	// 내꺼
	public static String mySolution(int n) {
		String[] numbers = {"4", "1", "2"};
	    String answer = "";
	      
	    int num = n;
	      
	    while(num > 0){
	       int temp = num % 3;
	       num /= 3;
	          
	       if(temp == 0) num--;
           answer = numbers[temp] + answer;
	    }
	      
	    return answer;
	}
		
}
