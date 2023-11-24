package java_basic;

import java.util.Scanner;

public class Banolim {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
		float outputFloat = 0f;
		
		System.out.print("�ݿø��� �Ǽ��� �Է��ϼ��� : ");
		inputFloat = scann.nextFloat();
		
		outputFloat = (int)((inputFloat * 100 + 5)/10) / 10f;
		
		System.out.println("�Է°� : " + inputFloat);
		System.out.println("�ݿø� : " + outputFloat);

	}

}
