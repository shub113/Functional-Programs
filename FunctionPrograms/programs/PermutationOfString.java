package com.bridgeit.FunctionPrograms.programs;

/**
 * 
 */

/**
 * @author shub
 *
 */
import java.util.*;

import com.bridgeit.FunctionPrograms.utility.Iteration;
import com.bridgeit.FunctionPrograms.utility.Recursion;
public class PermutationOfString {
	int c;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string..");
		String input=sc.next();
		
		System.out.println("Recursion");
		Recursion recurse= new Recursion();
		recurse.permute(input, 0, input.length()-1);
		
		System.out.println("\nIteration");
		Iteration ite= new Iteration();
		ite.permute(input);
	}
}
