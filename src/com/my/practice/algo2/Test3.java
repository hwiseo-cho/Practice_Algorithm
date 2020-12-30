package com.my.practice.algo2;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		int reuslt = new Test3().solution(citations);
 	}
	
	 public int solution(int[] citations) {
	        int answer = 0;
	        int high, low;
	        
	        Arrays.sort(citations);
	        for(int k=0; k<citations.length; k++) {
	        	System.out.print(citations[k] + " ");
	        }
	        
	        for(int i=citations.length-1; i>=0; i--) {
	            high = 0;
	            low = 0;
	            for(int j=citations.length-1; j>=0; j--) {
	                if(citations[i] >= citations[j]) {
	                    high = high+1;
	                }
	                if(citations[i] <= citations[j]) {
	                    low = low+1;
	                }
	            }
	            if(low == high && high == citations[i]) {
	                answer = high;
	                break;
	            }
	        }
	        return answer;
	    }
}
