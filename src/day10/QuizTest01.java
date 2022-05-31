package day10;

import java.util.Scanner;

public class QuizTest01 {
	
	
	public String input() {
	Scanner sc = new Scanner (System.in);
	String name;
	System.out.println("이름입력");
	name = sc.next();
	return name;
	}
	
	
	public void print (String name) {
		System.out.println("당신의 이름은"+name);
	}
	
	
	public String[] input02() {
Scanner input = new Scanner (System.in);
	
	String [] nameArr = new String[3];
	for (int i=0; i<nameArr.length;i++) {
		System.out.println(i+".이름입력");
		nameArr[i]= input.next();
		
	}return nameArr;
	}
	
	public void print02(String[] nameArr) {
	System.out.println("===이름출력===");
	for(int i= 0; i<nameArr.length; i++) {
		System.out.println(i+"."+nameArr[i]);
	}
	}
	

	}
