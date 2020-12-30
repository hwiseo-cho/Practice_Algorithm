package com.my.practice.algo2;

public class GoGo1 {

	public static void main(String[] args) {
		int n = 21;
		int result = new GoGo1().solution(n);
		System.out.println(result);
	}
	
	public int solution(int n) {
        if(n >= 5) {
        	if(n%5 == 0) {
        		return n/5;
        	} else {
        		if((n-(5*(n/5)))%3 == 0) {
        			int a = (n/5);
        			int b = (n-(5*(n/5)))/3;
        			return a+b;
        		} else {
        			if(n%3 == 0) {
        				return n/3;
        			} else {
        				return -1;
        			}
        		}
        	}
        } else {
        	if(n%3 == 0) {
        		return 1;
        	} else {
        		return -1;
        	}
        }
    }
}
