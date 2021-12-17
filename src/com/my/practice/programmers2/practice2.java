package com.my.practice.programmers2;

import java.util.*;
import java.util.stream.LongStream;

/*
 *	 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
	알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.
 */
public class practice2 {
	
	public static void main(String[] args) {
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		System.out.println(solution(lottos,win_nums));
	}
	
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
    
 
	// 내꺼
	public static int[] mySolution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
	        
        int unkown = 0;
        int min = 0;
        
        for(int k=0; k<lottos.length; k++) {
            if(lottos[k] == 0) {
                unkown++; 
            } else {    
                for(int i=0; i<win_nums.length; i++) {
                    if(win_nums[i] == lottos[k]) {
                        min++;
                    }
                }
            }
        }
        
        answer[0] = calNum(min+unkown);
        answer[1] = calNum(min);
        
        return answer;
	}
	
    public static int calNum(int num) {
        if(num == 2) {
            return 5;
        } else if(num == 3) {
            return 4;
        } else if(num == 4) {
            return 3;
        } else if(num == 5) {
            return 2;
        } else if(num == 6) {
            return 1;
        } else {
            return 6;
        }
    } 
		
		
}
