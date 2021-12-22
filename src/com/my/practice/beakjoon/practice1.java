package com.my.practice.beakjoon;

import java.util.*;
import java.util.stream.LongStream;

/*
 *	카카오톡 오픈채팅방에서는 친구가 아닌 사람들과 대화를 할 수 있는데, 본래 닉네임이 아닌 가상의 닉네임을 사용하여 채팅방에 들어갈 수 있다.

 *
 **/
public class practice1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		int n = sc.nextInt();
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,0);
		map.put(1,0);
		map.put(2,0);
		map.put(3,0);
		map.put(4,0);
		map.put(5,0);
		map.put(6,0);
		map.put(7,0);
		map.put(8,0);
		map.put(9,0);
		for(int i=1; i<=n; i++) {
			String str = String.valueOf(i);
			for(int t=0; t<10; t++) {
				if(str.length() - str.replaceAll(Integer.toString(t),"").length() > 0) {
					map.put(t, map.get(t) + str.length() - str.replaceAll(Integer.toString(t),"").length());
				}
			}
		}
        StringBuilder sb = new StringBuilder();
		for(int i=0; i<map.size(); i++) {
			sb.append(map.get(i) + " ");
		}
		System.out.println(sb.toString());
		System.out.println("as1f".chars().filter(c -> c == 'a').count());
		
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
