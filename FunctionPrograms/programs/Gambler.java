package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class Gambler{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        
        System.out.println("Enter number of times...");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            System.out.println("Enter stake");
            int stake=sc.nextInt();
            System.out.println("Enter goal");
            int goal=sc.nextInt();
            int win=0,bet=0,loss=0;
            while(stake>0 && stake<goal){
                int a=r.nextInt(2);
                if(a==0){
                    stake-=1;
                    loss++;
                }
                else{
                    stake+=1;
                    win++;
                }
                bet++;
            }
            System.out.println("win = "+win);
            System.out.println("loss = "+loss);
            System.out.println("win % = "+((int)(((double)win/bet)*100)));
            System.out.println("loss% = "+((int)(((double)loss/bet)*100)));
        }
    }
}