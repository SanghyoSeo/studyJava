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
		
		System.out.print("�������� �Է� : ");
		kor = scann.nextInt();
		
		System.out.print("�������� �Է� : ");
		eng = scann.nextInt();
		
		System.out.print("�������� �Է� : ");
		math = scann.nextInt();
		
		System.out.print("�������� �Է� : ");
		scien = scann.nextInt();
		
		total = kor + eng + math + scien;
		avg = total / 4f;
		avg = (int)((avg*100+5)/10) / 10f;
		
		if(avg<60) {grade = 'F';}
		if(avg>=60) {grade = 'D';}
		if(avg>=70) {grade = 'C';}
		if(avg>=80) {grade = 'B';}
		if(avg>=90) {grade = 'A';}
		
		System.out.println("����\t����\t����\t����\t����\t���\t\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor, eng, math, scien, total, avg, grade);

	}

}
