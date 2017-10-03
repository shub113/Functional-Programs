package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class LeapYear{
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year...");
        int a=scanner.nextInt();
        if(a>999 && a<10000){
            if(a%400==0  || (a%100!=0 && a%4==0)){
                System.out.println("Leapyear");
            }
            else
                System.out.println("Not a LeapYear");
        }
        else{
            System.out.println("Enter atleast 4 digit");
        }
    }
}
