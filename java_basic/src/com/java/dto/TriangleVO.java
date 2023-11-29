package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class TriangleVO extends Shape 
						implements Inputable, Outputable {
	
//	명시적 초기화
	private int width = 100;
	private int height = 10;
	
//	{
//		int random = (int)(Math.random()*11);
//		
//		if (random % 2 == 0) {
//			height = 0;
//			width = 0;
//		} else {
//			height = 1;
//			width = 1;
//		}
//	}
	
	public TriangleVO() {
		this.width = 0;
		this.height = 0;
	}
	
//	overloding
//	생성자 초기화
	public TriangleVO(int width, int height) {
		this.width = width;
		this.height = height;
	}


//	public void input() {
//		Scanner scann = new Scanner(System.in);
//		
//		System.out.print("밑변 : ");
//		width = scann.nextInt();scann.nextLine();
//		
//		System.out.print("높이 : ");
//		height = scann.nextInt();scann.nextLine();
//	}

	@Override
	public int surface() {
		return (int)(width * height * 0.5f);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		this.width = (scann.nextInt());
		scann.nextLine();
		System.out.print("높이 : ");
		this.height = (scann.nextInt());
		scann.nextLine();
	}

	@Override
	public String output() {
		return "삼각형 넓이";
	}
	
//	집: shape > 삼, 사, 원 
	
}
