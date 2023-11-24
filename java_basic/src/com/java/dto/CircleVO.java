package com.java.dto;

import java.util.Scanner;

public class CircleVO {
	
	int r = 0;
	float area = 0f;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
	}
	
	public void output() {
		System.out.println("≥–¿Ã");
	}
	
	public void printArea() {
		area = r * r * (float)Math.PI;
		System.out.println("");
	}

}
