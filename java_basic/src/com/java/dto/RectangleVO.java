package com.java.dto;

import java.util.Scanner;

public class RectangleVO {
	
	int width = 0;
	int height = 0;
	int area = 0;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		width = scann.nextInt();scann.nextLine();
		
		System.out.print("높이 : ");
		height = scann.nextInt();scann.nextLine();
	}
	
	public void output() {
		System.out.print("사각형의 넓이 : ");
	}
	
	public void printArea() {
		area = width * height;
		System.out.println(area);
	}

}
