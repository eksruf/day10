package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTest02 {

	public ArrayList input() {

		Scanner input = new Scanner (System.in);
		//int [] arr = new int[2];
		int a,b;
		ArrayList arr = new ArrayList();
		System.out.println("입력");
		a= input.nextInt();
		arr.add(a);
		System.out.println("입력");
		b= input.nextInt();
		arr.add(b);
		
		return arr;
		}
	
	public int op(ArrayList arr) {
		return (int)arr.get(0) + (int)arr.get(1);
		//return a[0]+a[1];
		}
	
	public void print(int a, int b, int c) {
	System.out.println(a+"+"+b+"="+c);
		}
}
