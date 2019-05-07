package com.dell.test;

import com.dell.services.ProjectManagerService;

public class testDell {
	public static void main(String[] args) {
		checkPM();
	}

	private static void checkPM() {
		System.out.println(new ProjectManagerService().findAll());		
	}

}
