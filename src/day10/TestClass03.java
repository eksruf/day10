package day10;

import java.util.Scanner;

public class TestClass03 {
	public int sumFunc(int num1,int num2) {
		int sum = num1+num2;
		return sum;
		
		
	}
	public String test() {
		System.out.println("testȣ��");
		return "12345"; //Ư���� ���� �����ִ� ��, ��ȯŸ�԰� ���� �ڷ����� �����
	}
	
	public void name() {
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է�: ");
		String s= input.next();
	}
	
	public String name2(String s){
		return s;
	}
}
