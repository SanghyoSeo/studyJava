package java_basic;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int inputInt = 0;
		int four = 0;
		int three = 0;
		int two = 0;
		int one = 0;
		
		System.out.print("���� �Է� : ");
		inputInt = scann.nextInt();
		
		four = inputInt / 1000;
//		three = inputInt % (four * 1000) / 100;
//		three = (inputInt - (four * 1000)) / 100;
//		three = inputInt / 100 - four * 10;
//		two = inputInt / 10 - four * 100 - three * 10;
//		one = inputInt / 1 - four * 1000 - three * 100 - two * 10;
		
//		�Է� - �ʿ���� �ڸ� 675 8
//		four = (inputInt - (inputInt % 1000)) / 1000;
//		three = (inputInt - (inputInt / 1000) * 1000) / 100;
//		two = (inputInt - (inputInt / 100) * 100) / 10;
//		one = inputInt - (inputInt / 10) * 10;
		
//		������ / �ڸ���
		three = inputInt % 1000 / 100;
		two = inputInt % 100 / 10;
		one = inputInt % 10;
		
		System.out.println("4�ڸ� ���� : " + four);
		System.out.println("3�ڸ� ���� : " + three);
		System.out.println("2�ڸ� ���� : " + two);
		System.out.println("1�ڸ� ���� : " + one);

	}

}