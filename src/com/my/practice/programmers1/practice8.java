package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 *2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요. */
public class practice8 {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a,b));
	}
	
	
	public static String solution(int a, int b) {
		String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String paramDate = "2016-"+a+"-"+b;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		try {
			d = sd.parse(paramDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		return arr[cal.get(Calendar.DAY_OF_WEEK)-1];
	}
	
	
	// 내꺼
	public static String mySolution(int a, int b) {
		String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String paramDate = "2016-"+a+"-"+b;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		try {
			d = sd.parse(paramDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		return arr[cal.get(Calendar.DAY_OF_WEEK)-1];
	}
		
}
