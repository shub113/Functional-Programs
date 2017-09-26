package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class Factors{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int flag=0;
        
        for(int i=2;i<a;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;}
                
            }
            if(flag==0){
                if(a%i==0)
                    System.out.println(i);
            }
            else
                flag=0;
        }
    }
}