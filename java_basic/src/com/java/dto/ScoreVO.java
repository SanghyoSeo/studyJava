package com.java.dto;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ScoreVO implements Comparable<ScoreVO> {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int scien;
	private Date date = new Date();
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String dateStr = format.format(date);
	
	public String getDateStr() {
		return dateStr;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getScien() {
		return scien;
	}

	public int total() {
		return kor + eng + math + scien; 
	}
	
	public float evg() {
		return ((int)(total() / 4f * 100 + 0.5)) / 100f;
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scann.nextLine();
		
		System.out.print("국어 : ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("영어 : ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("수학 : ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("과학 : ");
		scien = scann.nextInt();scann.nextLine();
		
		
		//날짜 받아서 정렬
		//로또 랜덤숫자 set으로 저장 6개 받기 set.size
		
	}
	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	
	public void printScore() {
		try {
			Date theDay = format.parse(dateStr);
			System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + scien 
					+ "\t" + total() + "\t" + evg() + "\t" + theDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int compareTo(ScoreVO other) {
		return this.dateStr.compareTo(other.getDateStr());
	}
	// string 컴퍼러블은 이미 만들어져있다.
}
