package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	 QuizTest03 t = new  QuizTest03();
	 
	 ArrayList arr = t.input(); //�Է¹ޱ�
	 
	 int sum = t.op(arr); //���ϱ�
	 
	t.print(arr,sum); //arr, sum ���
	
	 System.out.println(sum); //��(sum) ���
}
}
