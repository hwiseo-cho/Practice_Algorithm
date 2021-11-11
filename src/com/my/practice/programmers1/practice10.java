package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아,
 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 
 */
public class practice10 {
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		System.out.println(solution(arr1,arr2));
	}
	
	
	 public static int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] result = new int[arr1.length][arr1[0].length];
	        for(int i=0; i<arr1.length; i++) {
	        	for(int k=0; k<arr1[i].length; k++) {
	        		result[i][k] = arr1[i][k] + arr2[i][k];
	        	}
	        }
	        return result;
	    }
	
	
	// 내꺼
	public static String mySolution(String phone_number) {
		String result = "";
		for(int i=0; i<phone_number.length()-4; i++) {
			result += "*";
		}
		result += phone_number.substring(phone_number.length()-4, phone_number.length());
		return result;
	}
		
}
