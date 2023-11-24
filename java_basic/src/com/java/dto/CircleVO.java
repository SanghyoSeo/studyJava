package com.java.dto;

import java.util.Scanner;

public class CircleVO {
	
	int r = 0;
	float area = 0f;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.println("반지름 : ");
		r = scann.nextInt();scann.nextLine();
	}
	
	public void output() {
		System.out.println("원의 넓이 : ");
	}
	
	public void printArea() {
		area = (int)((r * r * Math.PI * 1000 + 5) / 10) / 100f;
		System.out.println(area);
	}

}
