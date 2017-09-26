package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class Quadratic{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a,b,c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
        double d=Math.sqrt((b*b)-(4*a*c));
        
        System.out.println("1st root = "+(-b+d)/(2*a));
        System.out.println("2nd root = "+(-b-d)/(2*a));
    }
}