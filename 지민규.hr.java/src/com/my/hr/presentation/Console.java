package com.my.hr.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		do {
		Console.inMsg(msg);
		input = sc.nextLine();
		isGood = input.length() <= 5;
		} while(!isGood);
		
		return input;
	}
	
	public static int inDate(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[]");
			if(!isGood) Console.err("입사연도를 입력해주세요");
		} while(!isGood);
		return Integer.parseInt(input);
	}
	
	static void err(String msg) {
		System.out.println("ERROR]" + msg);

	}
}
