package java_basic;

import java.util.Scanner;

public class holJJak {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);

		int input = 0;
		char juge = ' ';
		
		System.out.println("정수 하나를 입력하시오.");
		input = scann.nextInt();
		
		if (input % 2 == 0) {
			juge = '짝';
		} else {
			juge = '홀';
		}
		
		System.out.println("입력한 정수 " + input + "는 " + juge + "수입니다.");

	}

}
