package com.java.object;

import com.java.dto.ScoreVO;

public class Object {

	public static void main(String[] args) {
		 ScoreVO score1 = new ScoreVO();
		 ScoreVO score2 = new ScoreVO();
		 
		 score1.input();
		 score2.input();
		 
		 System.out.println("score1.hashcode() : " + score1.hashCode());
		 System.out.println("score2.hashcode() : " + score2.hashCode());
		 
		 System.out.println("score1.equals(score2) : " + score1.equals(score2));
		 
		 System.out.println(score1);
		 System.out.println(score2);
		 
		 // 오브젝트에서 정의한 투스트링
	}

}
