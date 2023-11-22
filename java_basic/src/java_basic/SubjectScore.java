package java_basic;

import java.util.Scanner;

public class SubjectScore {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int scien = 0;
		
		int total = 0;
		float avg = 0f;
		char grade = 'F';
		
		System.out.print("국어점수 입력 : ");
		kor = scann.nextInt();
		
		System.out.print("영어점수 입력 : ");
		eng = scann.nextInt();
		
		System.out.print("수학점수 입력 : ");
		math = scann.nextInt();
		
		System.out.print("과학점수 입력 : ");
		scien = scann.nextInt();
		
		total = kor + eng + math + scien;
		avg = total / 4f;
		avg = (int)((avg*100+5)/10) / 10f;
		
		if(avg<60) {grade = 'F';}
		if(avg>=60) {grade = 'D';}
		if(avg>=70) {grade = 'C';}
		if(avg>=80) {grade = 'B';}
		if(avg>=90) {grade = 'A';}
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균\t\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor, eng, math, scien, total, avg, grade);

	}

}
