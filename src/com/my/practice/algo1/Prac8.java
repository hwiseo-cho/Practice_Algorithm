package com.my.practice.algo1;

// 선택 정렬

public class Prac8 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int min = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*9)+1;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
