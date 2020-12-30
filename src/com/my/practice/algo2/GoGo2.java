package com.my.practice.algo2;

public class GoGo2 {

	public static void main(String[] args) {
		String s1 = "ABCxy";
		String s2 = "xyZA";
		
		String result = new GoGo2().solution(s1, s2);
		System.out.println(result);
	}
	
	public String solution(String s1, String s2) {
		String answer = "";
		String a = "";
		String b = "";
        if(s1.length() > s2.length()) {
        	for (int i = 0; i < s1.length(); i++) {
				if(s1.startsWith(s2.substring(s2.length()-(i+1),s2.length()))) {
					continue;
				} else {
					a = s2;
					a += s1.substring(i+1, s1.length());
					break;
				}
			}
        	for (int i = 0; i < s1.length(); i++) {
        		if(s1.endsWith(s2.substring(s2.length()-(i+1),s2.length()))) {
        			continue;
        		} else {
        			b = s2;
        			b += s1.substring(i+1, s1.length());
        			break;
        		}
        	}
        	
        } else {
        	for (int i = 0; i < s2.length(); i++) {
				if(s2.startsWith(s1.substring(s1.length()-(i+1),s1.length()))) {
					continue;
				} else {
					a = s1;
					a += s2.substring(i+1, s2.length());
					break;
				}
			}
        	for (int i = 0; i < s2.length(); i++) {
        		if(s2.endsWith(s1.substring(s1.length()-(i+1),s1.length()))) {
        			continue;
        		} else {
        			b = s1;
        			b += s2.substring(i+1, s2.length());
        			break;
        		}
        	}
        }
        if(a.length() > b.length()) {
        	return b;
        } else {
        	return a;
        }
    }
}
