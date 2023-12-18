package com.java.dto;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ScoreVO implements Comparable<ScoreVO> {
	
	private String stuNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int scien;
	private Date regDate;
	
	public String getStuNum() {
		return stuNum;
	}
	
	public Date getRegDate() {
		return regDate;
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
		
		System.out.print("학번 : ");
		stuNum = scann.nextLine();
		
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
		
		regDate = new Date();
		
		//날짜 받아서 정렬
		//로또 랜덤숫자 set으로 저장 6개 받기 set.size
		
	}
	
	public static void printLabel() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t과학\t총점\t평균\t등록일");
	}
	
	public void printScore() {
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String regDate = stdFormat.format(this.regDate);
		String today = stdFormat.format(new Date());
		
		if(regDate.equals(today)) {
			regDate = new SimpleDateFormat("HH:mm:ss").format(this.regDate);
		}
		
		System.out.println(stuNum + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + scien 
				+ "\t" + total() + "\t" + evg() + "\t" + regDate);
		
	}

	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ScoreVO) {
			ScoreVO other = (ScoreVO)obj;
			return other.stuNum.equals(stuNum);
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(ScoreVO other) {
		if(this.stuNum.equals(other.stuNum)) {
			return 0;
		} else {			
			return other.getRegDate().compareTo(this.regDate);
		}
	}
	// string 컴퍼러블은 이미 만들어져있다.
}







