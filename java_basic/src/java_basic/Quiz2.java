package java_basic;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		double computer = (int)(Math.random()*3);
		int player = 0;
		String computerString = " ";
		String playerString = " ";
		
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		System.out.print("����: ");
		player = scann.nextInt() - 1;
		
		if (computer == 0) {
			computerString = "����";
		}
		if (computer == 1) {
			computerString = "����";
		}
		if (computer == 2) {
			computerString = "��";
		}
		
		if (player == 0) {
			playerString = "����";
		}
		if (player == 1) {
			playerString = "����";
		}
		if (player == 2) {
			playerString = "��";
		}
		
		System.out.println("��ǻ�� : " + computerString);
		System.out.println("��� : " + playerString);
		
		
		
	}

}