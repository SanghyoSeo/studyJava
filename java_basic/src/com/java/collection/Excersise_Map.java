package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class Excersise_Map {

	public static void main(String[] args) {
		// 캐릭터형으로 A를 랩핑한다.
		Character c = 'A';
		// 이항연산에서는 int이하의 데이터형들은 int형으로 자동형변환을 하는데
		// 문자는 2Byte이기때문에 A의 아스키코드 값이 int형으로 바뀌어서 계산된다.
		int b = 1 + 'A';
		// 랩핑하는 것과 자동형변환은 다르기때문에 map에 저장할 때 제네릭이<Integer>라면
		// A는 문자로 랩핑되기 때문에 오류가 날 수 있다. 

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 123);
		map.put("b", 456);
		
		//treeMap, hashMap		
		
//		map.put("c", 'A');
//		map.put("d", "A");
//		map.put("e", true);
//		map.put("f", 789f);
//		
//		for (int i = 0; i < map.size(); i++) {
//			char temp = 'a';
//			String key = "" + (char)(temp + i);
//			System.out.println("key : " + key + ", value: " + map.get(key));
//		}
		
	}

}
