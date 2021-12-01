package com.my.practice.programmers1;

import java.util.*;

/*
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.

사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
*/
public class practice18 {
	
	public static void main(String[] args) {
		int[] people = {70,80,50};
		int limit    = 100;
		System.out.println(solution(people,limit));
	}
	
	
	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int min = 0;
		
		for(int max=people.length-1; min<= max; max--) {
			if(people[min] + people[max] <= limit) {
				min++;
			}
			answer++;
		}
        return answer;
    }
	
	
	// 내꺼
	public static int mySolution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		for(int i=0; i<people.length; i++) {
			if(people[i] == 0) {
				continue;
			} else {
				if(people[i] <= limit) {
					if(i != people.length-1) {
						if(people[i+1]+people[i] <= limit) {
							people[i+1] += people[i];
						} else {
							answer++;
						}
					} else {
						if(people[i] <= limit) {
							answer++;
						}
					}
				} else {
					if(people[i-1] <= limit) {
						answer++;
					}
				}
			}
		}
		
        return answer;
	}
		
}
