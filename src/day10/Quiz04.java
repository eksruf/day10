package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04 {
public static void main(String[] args) {
	/*
	 두 수를 입력 받아 합을 출력 (배열이용)
	 입력 출력 연산 메인 기능으로 만들기
	 */
	/*
	QuizTest04 t = new QuizTest04();
	int [] a= t.input();
	int s=t.op(a);
	t.print(a, s);
*/
	// ArrayList로 변환해보세요
	/*
	 QuizTest04 t = new  QuizTest04();
	 ArrayList a = t.input();
	int s = t.op(a);
	t.print(a, s);
	*/
	
	//3명의 이름을 입력받아 출력하는 프로그램을 만드세요
	QuizTest04 t = new QuizTest04();
	
	String[] name = t.input();
	t.print(name);
}
}
