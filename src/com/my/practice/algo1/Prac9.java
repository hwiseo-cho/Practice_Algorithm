package com.my.practice.algo1;

/*
 *	2차원 배열에 직각 삼각형 형태로 1000까지의 자연수 중 2부터 시작하여 순차적으로 
 *	소수를 15개 까지 저장하는 알고리즘을 작성하라.
 */
public class Prac9 {
  
	public static void main(String[] args) {
//		별찍기 
//		for (int i = 1; i < 4; i++) {
//			for (int j = 3; j > 0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		 
//		소수 구하기
//		int i = 2;
//		Boolean result = true;
//		while(i <= 1000) {
//			result = true;
//			for (int j = 2; j < i; j++) {
//				if(i%j == 0) {
//					result = false;
//					continue;
//				} 
//			}
//			if(result == true) {
//				System.out.print(i+" ");
//			}
//			i++;
//		}
		
		int count = 0;
		int[] pri = new int[15];
		int[][] arr = new int[5][5];
		int num = 2;
		Boolean result = true;
		int temp = 0;
		
		while(count < 15) {
			result = true;
			for (int i = 2; i < num; i++) {
				if(num%i == 0) {
					result = false;
					continue;
				} 
			}
			if(result == true) {
				pri[count] = num;
				count++;
			}
			num++;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-1; j>=0; j--) {
				if(i < j) {
					System.out.printf("   ");
				} else {
					arr[i][j] = pri[temp];
					temp++;
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
