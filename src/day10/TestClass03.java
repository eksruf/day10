package day10;

import java.util.Scanner;

public class TestClass03 {
	public int sumFunc(int num1,int num2) {
		int sum = num1+num2;
		return sum;
		
		
	}
	public String test() {
		System.out.println("test호출");
		return "12345"; //특정한 값을 돌려주는 역, 반환타입과 값의 자료형을 맞춘다
	}
	
	public void name() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String s= input.next();
	}
	
	public String name2(String s){
		return s;
	}
}
