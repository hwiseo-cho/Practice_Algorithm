package com.my.practice.programmers1;

import java.util.*;

/*
 *	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

	0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요. */
public class practice7 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,0};
		int divisor = 5;
		
		System.out.println(solution(arr,divisor));
	}
	
	
	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
	}
	
	
	// 내꺼
	public static int[] mySolution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
	}
		
}
