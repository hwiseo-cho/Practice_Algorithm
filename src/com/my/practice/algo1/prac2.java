package com.my.practice.algo1;

public class prac2{

    public int solution(int[] arr, int num){
    	int day = 1;
    	int temp = 0;
    	int temp2 = 0;
    	int result = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(temp2 > 0) {
    			arr[i] = arr[i]+temp2;
    		}
    		temp = 0;
			temp2 = 0;
			day = 1;
    		if(arr[i] == 0) {
    			continue;
    		} else if(arr[i] > num) {
    			temp = arr[i]/num;
    			day = day*temp;
    			temp2 = arr[i] - num*temp; 
    			result = result + day;
    		} else {
    			
    			result++;
    		}
    	}
    	return result;
    }
}