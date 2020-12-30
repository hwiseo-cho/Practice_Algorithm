package com.my.practice.algo2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GoGo4 {

	public static void main(String[] args) {
		int[] coffee_times = {4,2,2,5,3};
		int N = 3;
		int[] result = new GoGo4().solution(N, coffee_times);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+",");
		}
	}
	
	public int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];
        int[] arr = new int[N];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<N; i++) {
           q.add(coffee_times[i]);
        }
        return answer;
    }
}
