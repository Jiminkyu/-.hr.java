package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;


public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void check() {
		int choice = 0;
		
		
		choice = sc.nextInt();
		
	
	
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
	
	public static LocalDate inDate(String msg) {
		String input1 = "";
		String input2 = "";
		String input3 = "";
		int year;
		int month;
		int day;
		boolean isGood = false;
		boolean isGood1 = false;
		
		do {
			Console.inMsg("YYYY-MM-DD 입사년도");
			input1 = sc.nextLine();
			isGood = input1.matches("[1-2][0-9][0-9][0-9]");
			if(!isGood) Console.err("입사연도를 입력해주세요");
		} while(!isGood);
		
		year = Integer.parseInt(input1);
		
		do {
			isGood = false;
			Console.inMsg(input1 + "-MM-DD 입사월");
			input2 = sc.nextLine();
			isGood = input2.matches("[1][0-2]");
			isGood1 = input2.matches("[1-9]");
			if(!isGood || !isGood1) Console.err("입사월을 입력해주세요");
		} while(!isGood || !isGood1);
		
		month = Integer.parseInt(input2);
		
		do {
			isGood = false;
			isGood1 = false;
			Console.inMsg(input1 + "-" + input2 + "-DD 입사일");
			input3 = sc.nextLine();
			isGood = input3.matches("[1-3][0-9]");
			isGood1 = input3.matches("[1-9]");
			if(!isGood || !isGood1) Console.err("입사일을 입력해주세요");
		} while(!isGood || !isGood1);
		
		day = Integer.parseInt(input3);
		
		return LocalDate.of(year, month, day);
	}
	
	static void err(String msg) {
		System.out.println("ERROR]" + msg);

	}
}
