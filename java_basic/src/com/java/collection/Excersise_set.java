package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.java.comparator.ScoreTotalComparator;
import com.java.dto.ScoreVO;

public class Excersise_set {

	public static void main(String[] args) {

		Set<ScoreVO> set = new TreeSet<ScoreVO>();
		Set<ScoreVO> treeSetByComparator 
				= new TreeSet<ScoreVO>(new ScoreTotalComparator());
		
		// 총점으로 정렬이 되어있는가?
		// hashSet은 컴퍼러블하지 않아도 값을 넣는다.
		
		for(int i=0; i<3; i++) {
			ScoreVO score1 = new ScoreVO();
			
			score1.input();
			
			set.add(score1);
			treeSetByComparator.add(score1);
		}
		
		Iterator<ScoreVO> it = set.iterator();
		
		while(it.hasNext()) {
			it.next().printScore();
		}
		
		System.out.println("-------------------------------");
		
		it = treeSetByComparator.iterator();
		while(it.hasNext()) {
			it.next().printScore();
		}
		
		
		
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(8);
//		set.add(4);
//		set.add(3);
//		set.add(6);
//		set.add(9);
//		set.add(7);
//		
//		System.out.println("set 사이즈 : " + set.size());
//		
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}

}
