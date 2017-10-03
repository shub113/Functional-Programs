package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class HarmonicSeries{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter..");
        int a=sc.nextInt();
        float b=1.0f;
        
        if(a<1)
            System.out.println("Enter positive number...");
        else if(a==1)
            System.out.println(b);
        else{
            for(float i=2.0f;i<=a;i++){
                b=b+((float)1.0f/i);
            }
            System.out.println(b);
    }}          
}