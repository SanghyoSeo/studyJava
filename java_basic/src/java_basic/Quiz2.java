package java_basic;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		int computer = (int)(Math.random()*3);
		String com_kwb = ""; // 가위 0 바위 1 보 2
		
		int player = 0;
		String player_kwb = ""; // 가위 0 바위 1 보 2
		
		int menu = 0;
		String juge = "";
		
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("입력: ");
		
		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		player = menu - 1;
		
		if (computer == ((player+1)%3)) { //�����
			juge = "이김";
		} else {
			if (computer == player) { //�����
				juge = "비김";
			} else { //�̰���
				juge = "짐";
			}
		}
		
		switch (player) {
		case 0:
			player_kwb = "가위";
			break;
		case 1:
			player_kwb = "바위";
			break;
		case 2:
			player_kwb = "보";
			break;
		}
		
		switch (computer) {
		case 0:
			com_kwb = "가위";
			break;
		case 1:
			com_kwb = "바위";
			break;
		case 2:
			com_kwb = "보";
			break;
		}
		
		System.out.println("컴퓨터 : " + com_kwb);
		System.out.println("나 : " + player_kwb);
		
		System.out.println(juge);
		
	}

}