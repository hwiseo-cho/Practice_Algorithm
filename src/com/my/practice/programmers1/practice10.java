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
		String s = "cdcd";
		System.out.println(solution(s));
	}
	
	
	 public static int solution(String s) {
		 String str = "";
	        char[] arr = s.toCharArray();
	        for(int i=0; i<arr.length; i++) {
	        	int count = 0;
	            if(i != 0) {
	                if(arr[i-1] == arr[i]) {
	                    str += arr[i-1];
	                    count++;
	                } else if(count > 0 && arr[i-1] != arr[i]) {
	                	s.replace(str, "");
	                	i = 0;
	                }
	            } 
	        }
	        String k = "";
	        for(int t=0; t<arr.length; t++) {
	        	k += arr[t];
	        }
	        k.replaceAll(" ","");
	        if(k.equals("")) {
	        	return 0;
	        } else {
	        	return 1;
	        }
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
