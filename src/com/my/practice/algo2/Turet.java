package com.my.practice.algo2;
import java.util.Scanner;

/*
 *	석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 
 *	조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 *	조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 
 *	조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
 *	류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오. 
 */
public class Turet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			System.out.println(solution(x1,y1,r1,x2,y2,r2));
		}
	}

	public static int solution(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 두 점사이의 거리의 제곱
		int distance_pow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		// 중점이 같으면서 반지름도 같을 경우
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		// 두 원의 반지름 합보다 중점간 거리가 더 길 때
		} else if(distance_pow > Math.pow(r1+r2, 2)) {
			return 0;
		// 원 안에 있으나 내접하지 않을 때
		} else if(distance_pow < Math.pow(r2-r1, 2)) {
			return 0;
		// 내접할 때
		} else if(distance_pow == Math.pow(r2-r1, 2)) {
			return 1;
		// 외접할 때
		} else if(distance_pow == Math.pow(r1+r2, 2)) {
			return 1;
		} else {
			return 2;
		}
		
	}
}
