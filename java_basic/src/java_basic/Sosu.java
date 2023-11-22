package java_basic;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int temp = 0;
		boolean isSotsu = true;
		
		System.out.print("정수 입력 : ");
		temp = scann.nextInt();
		
		for(int i=2; i<temp; i++) {
			if(temp % i == 0) {
				isSotsu = false;
			}
		}
		
		if(isSotsu) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
