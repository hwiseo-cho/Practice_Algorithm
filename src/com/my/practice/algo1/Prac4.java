package com.my.practice.algo1;

import java.util.Random;

/*
 *	부호를 포함하는 8비트 2진수 값을 10진수로 변환하는 알고리즘을 작성하라
 *	단, 8비트 2진수 값의 최상위 비트는 부호비트이다.
 *	부호비트가 0일 경우 양수, 1일 경우 음수이다.(음수의 경우 2의 보수로 표현)
 *	ex)
 *	00011001(2) = 25(10)
 *	11110000(2) = -16(10)
 *	10011100(2) = -100(10)
 */
public class Prac4{
	
	public static void main(String[] args) {
		int[] arr = new int[8]; // 최상위 비트가 부호비트인 8비트 2진수를 받을 배열
    	
    	Random random = new Random();
    	for(int i=0; i<8; i++) {
    		arr[i] = (int)random.nextInt(2); // 0,1 랜던 값
    	}
    	int result = 0;
    	for (int i = 1; i < 8; i++) {
			result += arr[i]*(Math.pow(2, 7-i));
		}
    	if(arr[0] == 1) {
    		result = 128-result;
    		result = result*-1;
    	}
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
    	System.out.println();
		System.out.println("결과값: " + result);
		
	}
	
}