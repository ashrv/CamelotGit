package com.communication;

import java.util.Scanner;

public abstract class UserInput<T>{
	private static Scanner scanner;
	public UserInput() {
		if(scanner==null)
			scanner = new Scanner(System.in);
	}
	protected String waitFor(T msg) {
		do {
			if(scanner.hasNext()) {
				var input = scanner.nextLine();
				var check = checkFormat(input, msg);
				if(check)
					return input;
			}
		}while(true);
	}
	
	protected abstract boolean checkFormat(String input, T msg);
}
