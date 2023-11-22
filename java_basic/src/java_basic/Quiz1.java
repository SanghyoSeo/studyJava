package java_basic;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int inputInt = 0;
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		float temp = 0f;
		
		System.out.print("정수 입력 : ");
		inputInt = scann.nextInt();
				
//		four = inputInt / 1000;
//		나머지 / 자리수
//		three = inputInt % 1000 / 100;
//		two = inputInt % 100 / 10;
//		one = inputInt % 10;
		
		temp = inputInt / 10000f; 
		
		temp = temp * 10;
		e3 = (int)(temp);
		temp = temp - e3;
		
		temp = temp * 10;
		e2 = (int)(temp);
		temp = temp - e2;
		
		temp = temp * 10; 
		e1 = (int)(temp);
		temp = temp - e1;
		
		temp = temp * 10;
		e0 = (int)(temp + 0.5);
		
		System.out.println("4자리 숫자 : " + e3);
		System.out.println("3자리 숫자 : " + e2);
		System.out.println("2자리 숫자 : " + e1);
		System.out.println("1자리 숫자 : " + e0);

	}

}