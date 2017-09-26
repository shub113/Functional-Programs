package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class WindChill{
    public static void main(String[]arg){
        double t=Double.parseDouble(arg[0]);
        double v=Double.parseDouble(arg[1]);
        
        if(t>50)
            System.out.println("Temp can't be greater than 50");
        else if(v>120 || v<3)
            System.out.println("Speed should be in range of (3,120)inclusive of both");
        else{
            double w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*(Math.pow(v,0.16)));
            System.out.println("W = "+ w);
        }
    }
}