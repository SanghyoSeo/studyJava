package java_basic;

import java.util.Scanner;

public class banolim {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
		float outputFloat = 0f;
		
		System.out.print("반올림할 실수를 입력하세요 : ");
		inputFloat = scann.nextFloat();
		
		outputFloat = (int)((inputFloat * 100 + 5)/10) / 10f;
		
		System.out.println("입력값 : " + inputFloat);
		System.out.println("반올림 : " + outputFloat);

	}

}
