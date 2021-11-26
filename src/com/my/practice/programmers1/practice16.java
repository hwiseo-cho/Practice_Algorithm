package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
 */
public class practice16 {
	
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		System.out.println(solution(number,k));
	}
	
	
	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
	
	
	// 내꺼
	public static String mySolution(String number, int k) {
		String answer = "";
        char[] arr = number.toCharArray();
        int[] numbers = new int[arr.length];
        int[] numbers2 = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
        	numbers[i]  = Integer.parseInt(String.valueOf(arr[i]));
        	numbers2[i] = Integer.parseInt(String.valueOf(arr[i]));
        }
        
        Arrays.sort(numbers);
        
        for(int i=0; i<k; i++) {
        	for(int t=0; t<arr.length; t++) {
        		if(numbers2[t] == numbers[i]) {
        			System.out.println("거르는수: "+numbers[i]);
        			numbers2[t] = 0;
        			break;
        		}
        	}
        }
        
        
        for(int i=0; i<numbers2.length; i++) {
        	System.out.println(numbers2[i]);
        	if(numbers2[i] != 0) {
        		answer += numbers2[i];
        	}
        }
        
        return answer;
	}
		
}
