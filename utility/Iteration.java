package com.bridgeit.FunctionPrograms.utility;

public class Iteration {
	public static void permute(String input){
		int counter2=2;
		System.out.println(input+1);
		char[] array= input.toCharArray();
		int[] intArray= new int[array.length];
		int counter =1;
		while(counter<array.length){
			if(intArray[counter]<counter){
				int j=((counter%2)==0)?0: intArray[counter];
				swap(array,counter,j);
				System.out.println(join(array)+counter2);
				counter2++;
				intArray[counter]++;
				counter=1;
			}else{
				intArray[counter]=0;
				counter++;
			}
		}
	}
	private static String join(char[] a) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(a);
	    return builder.toString();
	}
	private static void swap(char[] a, int i, int j) {
	    char temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}
