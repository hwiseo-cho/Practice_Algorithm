package com.my.practice.algo2;

import java.util.Stack;

public class Kakao {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println("________________________________");
		System.out.println(new Kakao().solution(board, moves));
		
	}

	    public int solution(int[][] board, int[] moves) {
//	        int answer = 0;
//	        ArrayList<Integer> arr = new ArrayList<>();
//	        
//	        for(int i=0; i<moves.length; i++) {
//	            int location = moves[i]-1;
//	            for(int j=0; j<board.length; j++) {
//	                if(location == j) {
//	                    for(int k=0; k<board.length; k++) {
//	                        if(board[k][j] == 0) {
//	                        	continue;
//	                        } else {
//	                        	arr.add(board[k][j]);
//	                        	System.out.print(board[k][j]+", ");
//	                            board[k][j] = 0;
//	                            break;
//	                        }
//	                    }
//	                    break;
//	                }
//	            }
//	            System.out.println();
//	        }
//	        System.out.println("____");
//	        for(int s : arr) {
//	        	if(s == 0) {
//	        		arr.remove(s);
//	        	} else {
//	        		System.out.print(s);
//	        	}
//	        }
//	        
//	        return answer;
	    	 int answer = 0;
	         Stack<Integer> stack = new Stack<>();
	         for(Integer move : moves) {
	             int moveIndex = move - 1;
	             for(int i = 0; i < board.length; i++) {
	                 int k = board[i][moveIndex];
	                 if(k == 0) continue;
	                 if(!stack.empty() && stack.peek() == k) {
	                     stack.pop();
	                     answer++;
	                 } else {
	                     stack.push(k);
	                 }
	                 board[i][moveIndex] = 0;
	                 break;
	             }
	         }
	         return answer * 2;
	    }
}
