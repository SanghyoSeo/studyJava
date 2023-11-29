package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {
//		속도가 빠름 / 중간에 넣기가 어려움
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add('a');
		list.add("a");
		list.add(false);
		list.add(1.0f);
		list.add(1.0);
		list.add(11);
		
		System.out.println("리스트 크기 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
		}
	}

}
