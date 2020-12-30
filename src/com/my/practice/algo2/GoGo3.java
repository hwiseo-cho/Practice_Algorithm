package com.my.practice.algo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GoGo3 {

	public static void main(String[] args) {
		int[] grade = {3,2,1,2};
		int[] result = new GoGo3().solution(grade);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		}
	
	 public int[] solution(int[] grade) {
	        int[] answer = new int[grade.length];
	        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	        int count = 1;
	        for(int i=grade.length-2; i>=0; i--) {
	        	if(grade[i+1] == grade[i]) {
	        		m.put(grade[i+1], count);
	        	} else {
	        		m.put(grade[i],count);
	        		count++;
	        	}
	        }
	        for (int i = 0; i < grade.length; i++) {
				answer[i] = m.get(grade[i]);
			}
	        return answer;
	    }
}
