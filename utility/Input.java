package com.bridgeit.FunctionPrograms.utility;

import java.util.Scanner;

public class Input {
	Scanner scan= new Scanner(System.in);
	public int integerInput(){
		int input= scan.nextInt();
		return input;
	}
	public boolean booleanInput(){
		boolean input=scan.nextBoolean();
		return input;
	}
	public double doubleInput(){
		double input= scan.nextDouble();
		return input;
	}
}
