package com.jdbc.main;

import com.jdbc.controller.MainController;
import com.jdbc.controller.고객Controller;

public class Main {

	private MainController mainC = new MainController();
	private 고객Controller 고객C = new 고객Controller();
	
	public static void main(String[] args) {
		Main main = new Main();
		while(true) {
			main.start();
		}
		

	}
	
	private void start() {
		String menu = mainC.menu();
		
		switch(menu) {
		case "1": 
			고객C.list();
			break;
		case "2":
			System.out.println("\n서비스 준비 중 입니다.\n");
			break;
		case "3":
			break;
		case "q":case "Q":
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println();
		}
	}

}
