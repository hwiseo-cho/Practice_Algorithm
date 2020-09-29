package com.my.practice.algo1;

public class Prac3 {
	
	public static void main(String[] args) {
		new Prac3().whatCanI();
	}
	
	public void whatCanI() {
		System.out.println("오늘 뭐하지이이ㅣ이이이ㅣ이이이");
		int result = (int)(Math.random()*4+1);
		
		switch (result) {
		case 1:
			System.out.println("공부~");
			break;
		case 2:
			System.out.println("먹기");
			break;
		case 3:
			System.out.println("책읽기");
			break;
		case 4:
			System.out.println("놀기!");
			break;
		}
	}
}
