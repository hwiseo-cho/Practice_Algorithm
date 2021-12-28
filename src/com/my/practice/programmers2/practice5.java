package com.my.practice.programmers2;

import java.util.*;
import java.util.stream.LongStream;

/*
 *	카카오톡 오픈채팅방에서는 친구가 아닌 사람들과 대화를 할 수 있는데, 본래 닉네임이 아닌 가상의 닉네임을 사용하여 채팅방에 들어갈 수 있다.

신입사원인 김크루는 카카오톡 오픈 채팅방을 개설한 사람을 위해, 다양한 사람들이 들어오고, 나가는 것을 지켜볼 수 있는 관리자창을 만들기로 했다. 채팅방에 누군가 들어오면 다음 메시지가 출력된다.

"[닉네임]님이 들어왔습니다."

채팅방에서 누군가 나가면 다음 메시지가 출력된다.

"[닉네임]님이 나갔습니다." 

채팅방에서 닉네임을 변경하는 방법은 다음과 같이 두 가지이다.

채팅방을 나간 후, 새로운 닉네임으로 다시 들어간다.
채팅방에서 닉네임을 변경한다.
닉네임을 변경할 때는 기존에 채팅방에 출력되어 있던 메시지의 닉네임도 전부 변경된다.	
 *
 **/
public class practice5 {
	
	public static void main(String[] args) {
		String[] record = {
								"Enter uid1234 Muzi", 
								"Enter uid4567 Prodo",
								"Leave uid1234",
								"Enter uid1234 Prodo",
								"Change uid4567 Ryan"
						   };
		System.out.println(solution(record));
	}
	
	
	public static String[] solution(String[] record) {
		String[] answer = {};
		Map<String,String> map = new HashMap<String, String>();
		List<String> list = new ArrayList<String>();
		for(int i=0; i<record.length; i++) {
			if(record[i].startsWith("Enter")) {
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				list.add(record[i].split(" ")[1] + " 님이 들어왔습니다.");
			} else if(record[i].startsWith("Leave")) {
				list.add(record[i].split(" ")[1] + " 님이 나갔습니다.");
			} else if(record[i].startsWith("Change")) {
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
			}
		}
		answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i).replace(list.get(i).split(" ")[0]+" ", map.get(list.get(i).split(" ")[0]));
		}
		
        return answer;
    }
    
 
	// 내꺼
	public static String[] mySolution(String[] record) {
		String[] answer = {};
		Map<String,String> map = new HashMap<String, String>();
		List<String> list = new ArrayList<String>();
		for(int i=0; i<record.length; i++) {
			if(record[i].startsWith("Enter")) {
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				list.add(record[i].split(" ")[1] + " 님이 들어왔습니다.");
			} else if(record[i].startsWith("Leave")) {
				list.add(record[i].split(" ")[1] + " 님이 나갔습니다.");
			} else if(record[i].startsWith("Change")) {
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
			}
		}
		answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i).replace(list.get(i).split(" ")[0]+" ", map.get(list.get(i).split(" ")[0]));
		}
		
        return answer;
	}

		
		
}
