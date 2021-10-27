package com.my.practice.programmers1;

import java.util.*;

/*
 *	 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가
 *   동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 *   스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class practice3 {
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10 ,12};
		int k = 7;
		
		System.out.println(solution(scoville, k));
	}
	
	
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++)
            q.add(scoville[i]);

        int count = 0;
        while(q.size() > 1 && q.peek() < K){
            int weakHot = q.poll();
            int secondWeakHot = q.poll();

            int mixHot = weakHot + (secondWeakHot * 2);
            q.add(mixHot);
            count++;
        }

        if(q.size() <= 1 && q.peek() < K)
            count = -1;

        return count;
	}
	
	
	// 내꺼
	public static int mySolution(int[] scoville, int k) {
		int answer = 0;
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		 for(int i=0; i<scoville.length; i++) {
			 queue.add(scoville[i]);
		 }
		 
		 int temp = 0;
		 int cnt = 0;
		 
		 while(!queue.isEmpty()) {
			 PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>();
			 while(!queue.isEmpty()) {
				 queue2.add(queue.poll());
			 }
			 
			 int num = queue2.peek();
			 if(num < k) {
				 if(temp > 0) {
					 queue2.add(temp+(num*2));
					 queue2.poll();
					 cnt++;
				 } else {
					 temp = num;
				 }
				 queue2.poll();
				 
			 } else {
				 temp = 0;
				 queue2.poll();
			 }
			 
			 queue = queue2;
		 }
		 answer = cnt;
		 if(cnt == 0) answer = -1;
	     return answer;
	}
		
}
