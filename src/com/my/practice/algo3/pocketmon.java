package com.my.practice.algo3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class pocketmon {
	
	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 3;
		arr[1] = 3;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 4;
		
		System.out.println(solution(arr));
	}
	
	// 풀이식
	// 나는 정렬을 하고 stack에 넣어 사용했지만
	// HashSet을 사용하여 중복없이 배열에 넣을 수 있기 때문에 HashSet을 사용하면 훨씬 간결하게 작성됨
	public static int solution(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		
		if(hs.size()>arr.length/2) {
			return arr.length/2;
		} else {
			return hs.size();
		}
	}
	
	// 내꺼
	public static int mySolution(int[] arr) {
		int result = 0;
		int num = arr.length/2;
		Arrays.sort(arr);
		
		Stack<Integer> stk = new Stack<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(i != 0) {
				if(arr[i-1] != arr[i]) {
					stk.add(arr[i]);
				}
			} else {
				stk.add(arr[i]);
			}
		}
		
		if(stk.size() >= num) {
			result = num;
		} else {
			result = stk.size();
		}
		return result;
	}
}
