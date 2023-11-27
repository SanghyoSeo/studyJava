package com.java.dto;

import java.util.Scanner;

public class TriangleVO {
	
//	명시적 초기화
	public int width = 100;
	public int height = 10;
	
	{
		int random = (int)(Math.random()*11);
		
		if (random % 2 == 0) {
			height = 0;
			width = 0;
		} else {
			height = 1;
			width = 1;
		}
	}
	
	public TriangleVO() {
		
	}
	
//	overloding
//	생성자 초기화
	public TriangleVO(int width, int height) {
		this.width = width;
		this.height = height;
	}


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
