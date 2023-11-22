package java_basic;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		int computer = (int)(Math.random()*3);
		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		
		int player = 0;
		String player_kwb = ""; // 가위 0, 바위 1, 보 2
		
		int menu = 0;
		String juge = "";
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("선택: ");
		
		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		player = menu - 1;
		
		if (computer == ((player+1)%3)) { //졌어요
			juge = "졌어요";
		} else {
			if (computer == player) { //비겼어요
				juge = "비겼어요";
			} else { //이겼어요
				juge = "이겼어요";
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
		System.out.println("당신 : " + player_kwb);
		
		System.out.println(juge);
		
	}

}