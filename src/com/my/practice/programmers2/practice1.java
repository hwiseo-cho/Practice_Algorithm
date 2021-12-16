package com.my.practice.programmers2;

import java.util.*;

/*
 *	 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가
 *   동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 *   스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class practice1 {
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(solution(arr));
	}
	
	
	public static int[] solution(int []arr) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
	}
	
	// 내꺼
	public static int[] mySolution(int[] arr) {
		int[] answer = {};
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				stack.add(arr[i]);
			} else {
				if(stack.peek() != arr[i]) {
					stack.add(arr[i]);
				}
			}
		}
		
		answer = new int[stack.size()];
		int k = 0;
		for(Integer s : stack) {
			answer[k] = s;
			k++;
		}
        
        return answer;
	}
		
}
