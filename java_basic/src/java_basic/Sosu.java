package java_basic;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int temp = 0;
		boolean isSotsu = true;
		
		System.out.print("���� �Է� : ");
		temp = scann.nextInt();
		
		for(int i=2; i<temp; i++) {
			if(temp % i == 0) {
				isSotsu = false;
			}
		}
		
		if(isSotsu) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
