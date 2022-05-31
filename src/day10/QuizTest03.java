package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTest03 {
public ArrayList input() {
	Scanner input = new Scanner (System.in);
	 ArrayList arr = new ArrayList();
	 
	 int value;
	 System.out.println("수입력");
	 value = input.nextInt();
	 arr.add(value);
	 
	 System.out.println("수입력");
	 arr.add(input.nextInt());
	  
	 return arr;
	 }
	 public int op (ArrayList arr){
		 return  (int) arr.get(0)+ (int)arr.get(1);
		 //get은 오브젝트 출력이므로 형변환이 필요하다
		 
	
	
} public void print (ArrayList arr, int s) {
	System.out.println(arr.get(0)+"+"+arr.get(1)+"="+s);
}
}
