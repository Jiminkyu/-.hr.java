package com.my.hr.presentation;

public enum Worker {
	LIST, ADD, FIX, DEL, EXIT;
	
	public static final Worker valueOf(int ordinal) {
		return values()[ordinal];
	}
}
