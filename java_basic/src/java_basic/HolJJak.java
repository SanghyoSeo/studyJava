package java_basic;

import java.util.Scanner;

public class HolJJak {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);

		int input = 0;
		char juge = ' ';
		
		System.out.println("���� �ϳ��� �Է��Ͻÿ�.");
		input = scann.nextInt();
		
		if (input % 2 == 0) {
			juge = '¦';
		} else {
			juge = 'Ȧ';
		}
		
		System.out.println("�Է��� ���� " + input + "�� " + juge + "���Դϴ�.");

	}

}
