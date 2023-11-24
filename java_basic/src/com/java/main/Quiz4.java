package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangleVO;
import com.java.dto.TriangleVO;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int choice = 0;
		
		System.out.println("���̸� ���� ������ �����Ͻÿ�.");
		System.out.println("1.�ﰢ�� 2.�簢�� 3.�� 4.����");
		
		while (choice != 4) {
			
			switch (choice) {
			case 1:
				TriangleVO triangle = new TriangleVO();
				triangle.input();
				triangle.output();
				break;
			case 2:
				RectangleVO rect = new RectangleVO();
				rect.input();
				rect.output();
				
				break;
			case 3:
				CircleVO circle = new CircleVO();
				circle.input();
				circle.output();
				break;
			}
		
		}
		

	}

}
