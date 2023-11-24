package com.java.dto;

import java.util.Scanner;

public class RectangleVO {
	
	int width = 0;
	int height = 0;
	int area = 0;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
	}
	
	public void output() {
		System.out.println("≥–¿Ã");
	}
	
	public void printArea() {
		area = width * height;
		System.out.println(area);
	}

}
