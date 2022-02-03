package com.my.practice.programmers2;

import java.util.*;
import java.util.stream.LongStream;

/*
 *	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

	제한 조건
	strings는 길이 1 이상, 50이하인 배열입니다.
	strings의 원소는 소문자 알파벳으로 이루어져 있습니다.   
	strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
	모든 strings의 원소의 길이는 n보다 큽니다.
	인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 *
 **/
public class practice8 {
	
	public static void main(String[] args) {
		int n = 4;	
		long left = 7L;
		long right = 14L;
		System.out.println(solution(n,left,right));
	}
	
	
	public static int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right-left+1)];
        
        int index = 0;
        int num = 0;
        
        for(int i=(int) left; i<right+1; i++) {
        	if(i < n) {
        		num = i+1;
        	} else {
        		int r = i/n;
        		int l = i%n;
        		if(l <= r) {
        			num = r+1;
        		} else {
        			num = l+1;
        		}
        	}
        	
        	if(i >= left && i <= right) {
        		result[index] = num;
				index++;
			}
        }

        
        
        return result;
    }
    
 
	// 내꺼
	public static int[] mySolution(int n, long left, long right) {
		int[] answer = {};
		
        return answer;
	}

		
		
}
