package com.practice;

import java.util.UUID;

public class UUIDJava {

	public static void main(String[] args) {
		
		String uuid = UUID.randomUUID().toString();
		String[] arg = uuid.split("-");
		System.out.println("Hell UUID "+ arg[0]);
		
		
		
	}

}
