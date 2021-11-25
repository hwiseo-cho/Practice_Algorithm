package com.my.practice.programmers1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 */
public class practice15 {
	
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location     = 2;
		System.out.println(solution(priorities,location));
	}
	
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<String> queue2 = new LinkedList<String>();
        String check = "";

        for(int i=0; i<priorities.length; i++) {
        	queue.add(priorities[i]);
        	queue2.add("A"+i);
        	if(i == location) {
        		check = "A"+i;
        	}
        }
        String str2 = "";
        while(!queue.isEmpty()) {
        	int k = 0;
        	int num = queue.peek();
        	boolean flag = true;
        	for(Integer c : queue) {
        		System.out.println("sdf: "+c);
        		if(k != 0) {
        			if(num < c) {
        				flag = false;
        				break;
        			}
        		}
        		k++;
        	}
        	
        	if(!flag) {
        		queue.add(queue.poll());
        		queue2.add(queue2.poll());
        	} else {
        		str2 += queue2.poll()+",";
        	}
        }

        String[] arr = str2.split(",");
        for(int t=0; t<arr.length; t++) {
        	if(arr[t].equals(check)) {
        		return t+1;
        	}
        }
        return answer;
    }
	
	
	// 내꺼
	public static int mySolution(int[] priorities, int location) {
		int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<String> queue2 = new LinkedList<String>();
        String check = "";

        for(int i=0; i<priorities.length; i++) {
        	queue.add(priorities[i]);
        	queue2.add("A"+i);
        	if(i == location) {
        		check = "A"+i;
        	}
        }
        String str2 = "";
        while(!queue.isEmpty()) {
        	int k = 0;
        	int num = queue.peek();
        	boolean flag = true;
        	for(Integer c : queue) {
        		System.out.println("sdf: "+c);
        		if(k != 0) {
        			if(num < c) {
        				flag = false;
        				break;
        			}
        		}
        		k++;
        	}
        	
        	if(!flag) {
        		queue.add(queue.poll());
        		queue2.add(queue2.poll());
        	} else {
        		str2 += queue2.poll()+",";
        	}
        }

        String[] arr = str2.split(",");
        for(int t=0; t<arr.length; t++) {
        	if(arr[t].equals(check)) {
        		return t+1;
        	}
        }
        return answer;
	}
		
}
