package com.my.practice.programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 *	 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가
 *   동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 *   스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class practice2 {
	
	public static void main(String[] args) {
		int[] progress = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		System.out.println(solution(progress, speeds));
	}
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
	}
	
	// 내꺼
	public static int[] mySolution(int[] progresses, int[] speeds) {
		Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<progresses.length; i++) {
        	int nam = 100 - progresses[i];
        	int day = (nam % speeds[i] == 0) ? nam / speeds[i] : (nam / speeds[i] + 1);
        	queue.add(day);
        }
        
        while(!queue.isEmpty()) {
        	int num = queue.poll();
        	int cnt = 1;
        	boolean run = true;
        	
        	while(run) {
        		if(!queue.isEmpty() && queue.peek() <= num) {
        			cnt++;
        			queue.poll();
        		} else {
        			run = false;
        		}
        	}
        	
        	list.add(cnt);     	
        	
        }
        int[] answer = new int[list.size()];
        for(int n=0; n<list.size(); n++) {
        	answer[n] = list.get(n);
        }
        
        return answer;
	}
		
}
