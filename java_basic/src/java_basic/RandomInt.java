package java_basic;

public class RandomInt {

	public static void main(String[] args) {
		
		double random = Math.random();
		
		int target = (int)(random*3);
		
		System.out.println(target);
		
		//규칙? 가위0 -> 바위1 -> 보2

	}

}
