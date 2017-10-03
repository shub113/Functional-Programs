package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class Distance{
    public static void main(String[]arg){
        int x=Integer.parseInt(arg[0]);
        int y=Integer.parseInt(arg[1]);
        
        System.out.println("Distance = "+Math.sqrt((x*x) + (y*y)) );
    }
}