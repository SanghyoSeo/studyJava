package com.java.dto;

import java.util.Scanner;

public class TriangleVO {
	
	int width = 0;
	int height = 0;
	float area = 0f;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		width = scann.nextInt();scann.nextLine();
		
		System.out.print("높이 : ");
		height = scann.nextInt();scann.nextLine();
	}
	
	public void output() {
		System.out.print("삼각형의 넓이 : ");
	}
	
	public void printArea() {
		area = width * height * 0.5f;
		System.out.println(area);
	}

}
