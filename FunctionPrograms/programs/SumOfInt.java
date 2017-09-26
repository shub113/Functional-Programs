package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class SumOfInt{
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of inputs");
        int x= sc.nextInt();
        System.out.println("Enter values");
        int a[]= new int[x];
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<x-2;i++){
            for(int j=i+1;j<x-1;j++){
                for(int k=j+1;k<x;k++){
                    if(a[i]+a[j]+a[k]==0){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("COUNT = "+count);
    }
}