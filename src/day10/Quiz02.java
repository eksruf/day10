package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	/*
	 �� ���� �Է� �޾� ���� ��� (�迭�̿�)
	 �Է� ��� ���� ���� ������� �����
	 */
/*
	Scanner input = new Scanner (System.in);
	int [] numArr = new int[2];
	
	for(int i=0;i<numArr.length;i++) {
		System.out.println("���� �Է�");
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
//	System.out.println("�Է�");
//	arr[0]= input.nextInt();
//	System.out.println("�Է�");
//	arr[1]= input.nextInt();
//	
//	int sum = arr[0]+arr[1];
//	System.out.println("�μ���: "+sum);
	
	QuizTest02 t =new QuizTest02();
	
	ArrayList arr =t.input();//�Է¹ޱ�
	
	int s = t.op(arr);//���ϱ�
	
//	t.print(a[0],a[1],s); //���
//	
//	System.out.println("��: "+s);
//			System.out.println(a[0]);
//			System.out.println(a[1]);
}
}
