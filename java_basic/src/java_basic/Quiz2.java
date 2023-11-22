package java_basic;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		double computer = (int)(Math.random()*3);
		int player = 0;
		String computerString = " ";
		String playerString = " ";
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("선택: ");
		player = scann.nextInt() - 1;
		
		if (computer == 0) {
			computerString = "가위";
		}
		if (computer == 1) {
			computerString = "바위";
		}
		if (computer == 2) {
			computerString = "보";
		}
		
		if (player == 0) {
			playerString = "가위";
		}
		if (player == 1) {
			playerString = "바위";
		}
		if (player == 2) {
			playerString = "보";
		}
		
		System.out.println("컴퓨터 : " + computerString);
		System.out.println("당신 : " + playerString);
		
		
		
	}

}