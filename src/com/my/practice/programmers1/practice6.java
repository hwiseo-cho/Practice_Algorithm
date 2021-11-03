package com.my.practice.programmers1;

import java.util.*;

/*
 *	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

	0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요. */
public class practice6 {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(solution(numbers));
	}
	
	
	public static int solution(int[] numbers) {
		int answer = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        
        for(int r=0; r<arr.length; r++) {
            boolean flag = true;
            for(int i=0; i<numbers.length; i++) {
                if(arr[r] == numbers[i]) {
                    flag = false;
                    break;
                }
            }    
            if(flag) {
                answer += arr[r];
            }
        }
        return answer;
	}
	
	
	// 내꺼
	public static int mySolution(int[] numbers) {
		int answer = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        
        for(int r=0; r<arr.length; r++) {
            boolean flag = true;
            for(int i=0; i<numbers.length; i++) {
                if(arr[r] == numbers[i]) {
                    flag = false;
                    break;
                }
            }    
            if(flag) {
                answer += arr[r];
            }
        }
        return answer;
	}
		
}
