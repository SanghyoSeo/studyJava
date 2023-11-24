package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangleVO;
import com.java.dto.TriangleVO;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int choice = 0;
		
		while (choice != 4) {
			System.out.println("넓이를 구할 도형을 선택하시오.");
			System.out.println("1.삼각형 2.사각형 3.원 4.종료");
			System.out.print("입력 >> ");
			choice = scann.nextInt();scann.nextLine();
			
			switch (choice) {
			case 1:
				TriangleVO triangle = new TriangleVO();
				triangle.input();
				triangle.output();
				triangle.printArea();
				break;
			case 2:
				RectangleVO rect = new RectangleVO();
				rect.input();
				rect.output();
				rect.printArea();
				break;
			case 3:
				CircleVO circle = new CircleVO();
				circle.input();
				circle.output();
				circle.printArea();
				break;
			}
			
			System.out.println();
		
		}
		

	}

}
