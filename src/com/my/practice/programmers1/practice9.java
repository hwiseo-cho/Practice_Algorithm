package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.*/
public class practice9 {
	
	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
	
	public static String solution(String phone_number) {
		String result = "";
		for(int i=0; i<phone_number.length()-4; i++) {
			result += "*";
		}
		result += phone_number.substring(phone_number.length()-4, phone_number.length());
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
