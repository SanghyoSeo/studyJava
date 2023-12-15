package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {
//		속도가 빠름 / 중간에 넣기가 어려움
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(4);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(6);
//		list.add('a');
//		list.add("a");
//		list.add(false);
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
		
		System.out.println("리스트 크기 : " + list.size());
		
		//정렬
		Collections.sort(list, Collections.reverseOrder());
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번지 값 : " + list.get(i));
		}
		
	}

}
