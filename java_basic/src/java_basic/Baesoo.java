package java_basic;

import java.util.Scanner;

public class Baesoo {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in); // 2, 3, 5�� ��� �Ǻ�
		
		int input = 0;
		String result = "";
		
		System.out.println("������ �Է��Ͻÿ�.");
		input = scann.nextInt();
		
		boolean condition = input % 2 != 0
						&& input % 3 != 0
						&& input % 5 != 0;
		
		boolean condition2 = input % 3 == 0 && input % 5 == 0;
		boolean condition3 = input % 2 == 0 && input % 5 == 0;
		
		if (condition) {
			result = "2, 3, 5�� ����� �ƴմϴ�.";
		} else {
			if (input % 2 == 0) {
				result = result + "2";
			}
			
			if (input % 2 == 0 && input % 3 == 0) {
				result = result + ", ";
			}
			
			if (input % 3 == 0) {
				result = result + "3";
			}
			
			if (condition2 || condition3) {
				result = result + ", ";
			}
			
			if (input % 5 == 0) {
				result = result + "5";
			}
			
			result = result + "�� ����Դϴ�.";
		}
		
		System.out.println(result);

	}

}