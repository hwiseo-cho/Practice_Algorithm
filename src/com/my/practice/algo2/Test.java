package com.my.practice.algo2;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		int[] result = new Test().solution(arr, divisor);
		for(int s : result) {
			System.out.println(s);
		}
	}

	public int[] solution(int[] arr, int divisor) {
		int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]%divisor == 0) {
				cnt++;
			} 
		}
        int[] answer = new int[cnt];
        if(cnt == 0) {
        	answer[0] = -1;
        } else {
        	for (int i = 0, p=0; i < arr.length; i++) {
        		if(arr[i]%divisor == 0) {
        			answer[p] = arr[i];
        			p++;
    			} 
			}
        }
        Arrays.sort(answer);
        return answer;
    }
}
