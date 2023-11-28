package com.java.dto;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println("바퀴개수 : " + car.wheel);
		
		car = new FireEngine(); // 어떤 인스턴스가 할당되는지 매우 중요
		if(car instanceof FireEngine) {
			
			car = new Car();
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel);
			
			System.out.println("----------------------------------------------");
			
			FireEngine f = new FireEngine();
			car = f;
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel); // 4
//			System.out.println(f.wheel); // 10
			
//			재정의 된 경우를 제외하고 레퍼런스의 값을 따라간다.
			
//			FireEngine f = (FireEngine)car;
//			System.out.println("부모 바퀴개수 : " + car.wheel);
//			System.out.println("자식 바퀴개수 : " + f.wheel);
//			
//			car.speedUp();
//			f.speedUp();
//			
//			car.speedDown();
//			f.speedDown();
		} else {
			System.out.println("FireEngine 인스턴스가 아닙니다.");
		}
		
	}

}
