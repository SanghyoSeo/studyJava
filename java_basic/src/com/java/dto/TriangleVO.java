package com.java.dto;

import java.util.Scanner;

public class TriangleVO {
	
	int width = 0;
	int height = 0;
	float area = 0f;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("�غ� : ");
		width = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");scann.nextLine();
		height = scann.nextInt();
	}
	
	public void output() {
		System.out.println("����");
	}
	
	public void printArea() {
		area = width * height * 0.5f;
		System.out.println();
	}

}
