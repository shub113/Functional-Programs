package com.bridgeit.FunctionPrograms.utility;

public class Recursion {
	int c=1;
	public void permute(String s,int l,int u){
		if(l==u){
			System.out.println(s+c);
			c++;
		}
		else{
			for(int i=l; i<=u;i++){
				s= swap(s,l,i);
				permute(s,l+1,u);
				s= swap(s,l,i);
			}
		}
	}
	public static String swap(String s,int l,int i){
		char[] c= s.toCharArray();
		char a=c[i];
		c[i]=c[l];
		c[l]=a;
		return String.valueOf(c);
	}
}
