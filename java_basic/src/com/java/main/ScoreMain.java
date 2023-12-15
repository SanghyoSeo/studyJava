package com.java.main;

import com.java.dto.ScoreVO;

public class ScoreMain {

	public static void main(String[] args) {

		ScoreVO s = new ScoreVO();
		
//		s.kor = 90;
//		s.eng = 87;
//		s.math = 90;
//		s.scien = 78;
		
		System.out.println("���� : " + s.total());
		System.out.println("��� : " + s.evg());
		
	}

}
