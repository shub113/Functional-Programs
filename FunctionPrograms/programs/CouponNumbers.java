package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class CouponNumbers{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number..");
        int a= sc.nextInt();
        
        ranNum(a);
    }
    
    public static void ranNum(int x){
        int[] k= new int[x];
        Random r= new Random();
        int flag=0;
        for(int i=0;i<k.length;i++){
            k[i]=r.nextInt(1000);
        }
        for(int i=0;i<k.length-1;i++){
            for(int j=i+1;j<k.length;j++){
                if(k[i]==k[j]){
                    ranNum(x);
                    return;
                }
            }
        }
        for(int i:k){
            System.out.println(i);
        }
    }
}