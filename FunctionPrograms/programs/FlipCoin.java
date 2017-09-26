package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class FlipCoin{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of times..");
        int a=sc.nextInt();
        float t=0.0f,h=0.0f;
        Random r= new Random();
        
        for(int i=1;i<=a;i++){
            float b=r.nextFloat();
            if(b<0.50)
               { t++;}
            else
                {h++;}
        }
        float tp=(float)(t/a)*100;
        float hp=(float)(h/a)*100;
        System.out.println("tail= "+tp+"%\nhead = "+hp+"%");
    }
}