package com.my.practice.programmers1;

import java.util.*;

/*
피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

예를들어

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.

2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요. 
*/
public class practice17 {
	
	public static void main(String[] args) {
		int n  = 24;
		System.out.println(solution(n));
	}
	
	
	public static int solution(int n) {
		int answer = 0;
        int num1 = 1;
        int num2 = 1;
        
        if(n==1 || n==2) return 1;
        else {
            for(int i=3; i<=n; i++) {
                answer = (num1+num2)%1234567;
                num1 = num2;
                num2 = answer;
                
            }
            return answer;
        }
    }
	
	
	// 내꺼
	public static int mySolution(int n) {
		int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
    	for(int i=2; i<=n; i++) {
    		list.add(list.get(i-1)+list.get(i-2));
    	}
        
        answer = list.get(list.size()-1)%1234567;
        return answer;
	}
		
}
