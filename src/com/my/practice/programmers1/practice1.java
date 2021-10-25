package com.my.practice.programmers1;

import java.util.*;

/*
 *	 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가
 *   동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 *   스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class practice1 {
	
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	
	
	public static int solution(String[][] clothes) {
		int answer = 0;
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
        	map.put(clothes[i][1],map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        if(map.size() > 1) {
        	int count = 1;
        	
        	for(String key : map.keySet()) {
        		count *= map.get(key)+1;
        	}
        	answer = count - 1;
        }
        
        return answer;
	}
	
	// 내꺼
	public static int mySolution(int[] arr) {
		return 0;
	}
		
}
