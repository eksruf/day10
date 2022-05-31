package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	 QuizTest03 t = new  QuizTest03();
	 
	 ArrayList arr = t.input(); //입력받기
	 
	 int sum = t.op(arr); //더하기
	 
	t.print(arr,sum); //arr, sum 출력
	
	 System.out.println(sum); //합(sum) 출력
}
}
