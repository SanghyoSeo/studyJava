package java_basic;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		int computer = (int)(Math.random()*3);
		String com_kwb = ""; // ���� 0, ���� 1, �� 2
		
		int player = 0;
		String player_kwb = ""; // ���� 0, ���� 1, �� 2
		
		int menu = 0;
		String juge = "";
		
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		System.out.print("����: ");
		
		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		player = menu - 1;
		
		if (computer == ((player+1)%3)) { //�����
			juge = "�����";
		} else {
			if (computer == player) { //�����
				juge = "�����";
			} else { //�̰���
				juge = "�̰���";
			}
		}
		
		switch (player) {
		case 0:
			player_kwb = "����";
			break;
		case 1:
			player_kwb = "����";
			break;
		case 2:
			player_kwb = "��";
			break;
		}
		
		switch (computer) {
		case 0:
			com_kwb = "����";
			break;
		case 1:
			com_kwb = "����";
			break;
		case 2:
			com_kwb = "��";
			break;
		}
		
		System.out.println("��ǻ�� : " + com_kwb);
		System.out.println("��� : " + player_kwb);
		
		System.out.println(juge);
		
	}

}