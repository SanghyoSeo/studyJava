package java_basic;

public class LogicOperation {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		
		boolean result;
		
//		result = ((a=1) > (b=2)) && ((c=3) > 2); // and연산 앞이 거짓이면 뒤는 계산 x
		result = ((a = 1) < (b = 2)) || ((c = 3) > 2); // or연산 앞이 참이면 뒤는 계산 x

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

	}

}
