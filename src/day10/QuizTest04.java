package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTest04 {
	/*
public int[]input() {
	Scanner input = new Scanner (System.in);
	int[] ar = new int[2];
	
	System.out.println("수입력");
	ar[0] =input.nextInt();
	System.out.println("수입력");
	ar[1]= input.nextInt();
	
	return ar;
}public int op(int ar[]) {
	return ar[0]+ar[1];
}public void print(int[]ar,int s) {
	System.out.println(ar[0]+"+"+ar[1]+"="+s);
}
	
	*/
	/*
	public ArrayList input() {
		ArrayList arr = new ArrayList();
		Scanner input = new Scanner (System.in);
		
		System.out.println("입력");
		arr.add(input.nextInt());
		System.out.println("입력");
		arr.add(input.nextInt());
		
		return arr;
	}public int op(ArrayList arr) {
		return (int)arr.get(0)+(int)arr.get(1);
	}public void print(ArrayList arr, int s) {
		System.out.println(arr.get(0)+"+"+arr.get(1)+"="+s);
	}
	*/
	public String[] input() {

		Scanner input = new Scanner (System.in);
		String[] name = new String[3];
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름 입력: ");
			name[i]= input.next();	
		}return name;
	}public void print(String[] name) {
		for(int i=0;i<name.length;i++) {
			System.out.println(i+": "+name[i]);
	}	
		}
	
}

