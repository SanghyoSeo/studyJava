package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.TriangleVO;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int choice = 0;
		
		while (choice != 4) {
			System.out.println("넓이를 구할 도형을 선택하시오.");
			System.out.println("1.삼각형 2.사각형 3.원 4.종료");
			System.out.print("입력 >> ");
			choice = scann.nextInt();scann.nextLine();
			
			switch (choice) {
			case 1:
				TriangleVO triangle = new TriangleVO();
				break;
			case 2:
				RectangularVO rect = new RectangularVO();
				break;
			case 3:
				CircleVO circle = new CircleVO();
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("올바른 입력이 아닙니다.");
			}
			
			System.out.println();
		
		}
//		정의: class, 형태: 필드 멤버변수, 기능: 메소드 함수
//		class 파일명과 동일, 첫글자 대문자
//		필드: 변수문법: 자동초기화(묵시적 초기화)
//		선언위치: 지역/전역
//		메소드: 리턴타입(주는거, 파라미터 타입(받는거) 함수 입장 선언적
//		 ㄴ 생성자: 인스턴스를 만들기 위한 , 리턴타입x, 파라미터 타입
		

	}

}
