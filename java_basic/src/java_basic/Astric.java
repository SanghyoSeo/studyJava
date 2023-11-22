package java_basic;

import java.util.Scanner;

public class Astric {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		String star = "";
		
		System.out.print("정수 입력: ");
		inputInt = scann.nextInt();
		
		for (int i = 0; i < inputInt; i++) {
			star = star + "*";
		}
		
		System.out.println(star);

	}

}
