package rotimarker;

import java.util.Scanner;

public class oddOrEven {
	
	static void oddFunction() {
		System.out.println("enter u r number");
		Scanner ref = new Scanner(System.in);
		int san = ref.nextInt();
		System.out.println("enter a number"+san);
		
		int i = san;
		if (  i%2 == 0) {
			System.out.println("u r number is even");
		}else {
			System.out.println("u r number is odd");
		}
	}

	public static void main(String[] args) {
		
		oddFunction();
		

	}

}
