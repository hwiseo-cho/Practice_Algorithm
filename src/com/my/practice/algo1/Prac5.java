package com.my.practice.algo1;
/*
 *	지뢰의 격자는 * 로 표시한다. 지뢰가 아닌 격자는 숫자로 표시하며 그 숫자는 인접해 있는 지로의 수를 의미한다.
 *	격자는 최대 8개의 인접한 지뢰를 가질 수 있다.
 *
 *	첫 번째 줄은 M*N의 M(행)과 N(열)에 해당하는 숫자이다. N과 M은 0보다 크고 100이하다. 그 다음 M개의 줄이 차례로 입력되고 각 줄은 정확하게
 *	N개의 문자가 입력된다. 지뢰 격자는 * 로 표시하며 지뢰가 아닌 격자는 .으로 표시한다.
 * 	EX)
 * 	*...
 * 	....
 * 	.*..
 * 	....
 * 
 * 	|
 * 	v
 * 
 * 	*100
 * 	2210
 * 	1*10
 * 	1110
 */

import java.util.Scanner;

public class Prac5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행 입력");
		int M = sc.nextInt();
		System.out.println("열 입력");
		int N = sc.nextInt();
		System.out.println("폭탄 개수");
		int count = sc.nextInt();
		
		int arr[][] = new int[M][N];
		int bomb1[] = new int[count];
		int bomb2[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			bomb1[i] = (int)Math.random()*M+1;
			bomb2[i] = (int)Math.random()*N+1;
//			for(int j=0; j < i; j++) {
//				if(bomb1[i] == bomb1[j] || bomb2[i] == bomb2[j]) {
//					i--;
//					continue;
//				}
//			}
			System.out.println(bomb1[i]);
			System.out.println(bomb2[i]);
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = 0;
				if(i < count && j < count) {
					if(i == bomb1[i] && j == bomb2[j]) {
						arr[i][j] = 9;
					}
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}




















