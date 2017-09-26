package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class PowerOfTwo{
    public static void main(String[]args){
        int a=Integer.parseInt( args[0]);
        int b=2;
        if(a==0)
            System.out.println("1");
        else if(a==1)
            System.out.println("2");
        else if(a<0)
            System.out.println("Enter positive power");
        else{
            for(int i=2;i<=a;i++){
                b=b*2;
            }
            System.out.println(b);
        }
    }
}