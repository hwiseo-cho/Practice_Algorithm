package com.my.practice.algo2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

x의 모든 0을 제거합니다.
x의 길이를 c라고 하면, x를 c를 2진법으로 표현한 문자열로 바꿉니다.
예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 1이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.


어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.

*/
public class Test2 {
	
	public static void main(String[] args) {
//		String number = "1231234";
//		int k = 3;
//		System.out.println(new Test2().solution(number, k));
		
		String s = "110010101001";
		new Test2().solution(s);
	}
	
	public String solution(String number, int k) {
        String answer = "";
        String[] arr = number.split("");
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= k; i--) {
			answer += arr[i];
		}
        return answer;
    }
	
	
	
	
	
	
	
	public int[] solution(String s) {
		int[] answer = {1};
		int countEz = 0;
		int countY = 0;
		while(s.equals("1")) {
			String[] arr = s.split("");
			if(s.contains("0")) {
				for(int i=0; i<arr.length; i++) {
					if(!arr[i].equals("0")) {
						s = "";
						s += arr[i];
					} else {
						countEz++;
					}
				}
			} else if(!s.contains("1")) {
				
			} else {
				break;
			}
		}
		
		return answer;
	}
}


















