package java_basic;

public class Variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int  i;
		long l;
		char c;
		String str;
		
		b = Byte.MAX_VALUE;
		s = Short.MAX_VALUE;
		i = Integer.MAX_VALUE;
		l = Long.MAX_VALUE;
		str = "\"안녕하세요\"\t\n반갑습니다.";
		
		c = 'A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("문자: %c ", c);
		System.out.printf("숫자: %d", (int)c);
		System.out.println(str);

	}

}
