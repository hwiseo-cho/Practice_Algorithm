package com.my.practice.programmers1;

import java.util.*;

/*
 *	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class practice4 {
	
	public static void main(String[] args) {
		int[] answer = {1, 2, 3, 4, 5};
		
		System.out.println(solution(answer));
	}
	
	
	public static int[] solution(int[] answer) {
		int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
	}
	
	
	// 내꺼
	public static int[] mySolution(int[] answer) {
		int[] first  = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third  = {3,3,1,1,2,2,4,4,5,5};
        
    	int cnt1 = 0;
    	int cnt2 = 0;
    	int cnt3 = 0;
    	
    	int index1 = 0;
    	int index2 = 0;
    	int index3 = 0;
        
        
        for(int i=0; i<answer.length; i++) {
        	if(index1 == 5) index1 = 0;
        	if(index2 == 8) index2 = 0;
        	if(index3 == 10) index3 = 0;
        
        	
        	if(answer[i] == first[index1]) {
        		cnt1++;
        	}
        	if(answer[i] == second[index2]) {
        		cnt2++;
        	}
        	if(answer[i] == third[index3]) {
        		cnt3++;
        	}
        	
        	index1++;
        	index2++;
        	index3++;
        }
        int[] arr = {cnt1,cnt2,cnt3};
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int r=0; r<arr.length; r++) {
        	if(r == 0) {
        		list.add(arr[r]);
        		resultList.add(1);
        	} else {
        		if(list.get(0) > arr[r]) {
        			continue;
        		} else if(list.get(0) == arr[r]) {
        			resultList.add(r+1);
        		} else {
        			list.remove(0);
        			list.add(arr[r]);
        			resultList.remove(0);
        			resultList.add(r+1);
        		}
        	}
        }
        int[] result = new int[resultList.size()];
        int c = 0;
        for(Integer i : resultList) {
        	result[c] = i;
        	c++;
        }
        
        return result;
	}
		
}
