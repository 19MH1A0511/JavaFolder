package rotimarker;

import java.util.Scanner;

public class rotis {

	public static void main(String[] args) {
		System.out.println("hi tell me how many rotis u need");
		Scanner  scan = new  Scanner(System.in);
		int roti = scan.nextInt();
		
		for(int i=1; i<=roti; i++)
		{
			System.out.println("completed all the rotis"+i);
		}
		

	}

}
