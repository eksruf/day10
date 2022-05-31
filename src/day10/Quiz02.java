package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	/*
	 두 수를 입력 받아 합을 출력 (배열이용)
	 입력 출력 연산 메인 기능으로 만들기
	 */
/*
	Scanner input = new Scanner (System.in);
	int [] numArr = new int[2];
	
	for(int i=0;i<numArr.length;i++) {
		System.out.println("수를 입력");
		numArr[i] = input.nextInt();
	}
	for(int i=0;i<numArr.length;i++) {
		System.out.println(i+":"+numArr[i]);
	}
	
	for(int i=0; i<numArr.length;i++) {
		
	}
	
	*/
//	Scanner input = new Scanner (System.in);
//	int [] arr = new int[2];
//	
//	System.out.println("입력");
//	arr[0]= input.nextInt();
//	System.out.println("입력");
//	arr[1]= input.nextInt();
//	
//	int sum = arr[0]+arr[1];
//	System.out.println("두수합: "+sum);
	
	QuizTest02 t =new QuizTest02();
	
	ArrayList arr =t.input();//입력받기
	
	int s = t.op(arr);//더하기
	
//	t.print(a[0],a[1],s); //출력
//	
//	System.out.println("합: "+s);
//			System.out.println(a[0]);
//			System.out.println(a[1]);
}
}
