package com.java.main;

import com.java.dto.TriangleVO;

public class PolyMain {

	public static void main(String[] args) {
		 
		TriangleVO t = new TriangleVO();
		
		System.out.println("height : " + t.height);
		System.out.println("width : " + t.width);
		
		TriangleVO tt = new TriangleVO(8, 88);
		
		System.out.println("height : " + tt.height);
		System.out.println("width : " + tt.width);

	}

}
