package com.my.practice.programmers1;

import java.util.*;

/*
트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
 
예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다. 
*/
public class practice20 {
	
	public static void main(String[] args) {
		int bridge_length   = 2;
		int weight		    = 10;
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution(bridge_length,weight,truck_weights));
	}
	     
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; 
        int temp_weight = 0;
        int idx=0;
        Queue<Integer> queue = new LinkedList<>();           
        
        while(true){  
            if(idx == truck_weights.length) {
            	break;
            }
            if(queue.size() == bridge_length){
                temp_weight-=queue.poll();                
            }
            else if(temp_weight+truck_weights[idx]>weight){
                queue.offer(0);
                answer++;
            }else{
                queue.offer(truck_weights[idx]);
                temp_weight+=truck_weights[idx];
                answer++;
                idx++;
            }            
        }
        return answer + bridge_length;
    }
	
	
	// 내꺼
	public static int mySolution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> tempQueue = new LinkedList<>();
		for(int i : truck_weights) {
			queue.add(i);
		}
		int i=0;
		while(queue.size() > 0) {
			if(tempQueue.size() > 0) {
				int tempAll = 0;
				for(Integer q : tempQueue) {
					tempAll += q;
				}
				
				if(tempAll + queue.peek() <= weight) {
					tempQueue.add(queue.poll());
					answer += 1;
				} else {
					queue.poll();
					tempQueue.clear();
					answer += bridge_length;
				}
			} else {
				tempQueue.add(queue.poll());
				answer += bridge_length;
			}
		}
		
        return answer;
	}
		
}
