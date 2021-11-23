package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class practice13 {
	
	public static void main(String[] args) {
		int left  = 13; 
		int right = 17;
		System.out.println(solution(left,right));
	}
	
	
	public static int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int yak = 0;
            for(int r=1; r<=i; r++) {
                if(i % r == 0) {
                    yak++;
                }
            }
            
            if(yak % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
	
	
	// 내꺼
	public static int mySolution(int left, int right) {
		int answer = 0;
        for(int i=left; i<=right; i++) {
            int yak = 0;
            for(int r=1; r<=i; r++) {
                if(i % r == 0) {
                    yak++;
                }
            }
            
            if(yak % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
	}
		
}
