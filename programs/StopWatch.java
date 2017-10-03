package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class StopWatch{
//     starting StopWatch
    private long start(int a){
        long x=0;
        if(a==48)
            System.exit(0);
        else
            x=System.currentTimeMillis();
        return x;
    }
//     stopping StopWatch
    private long stop(int b){
        long y=0;
        if(b==48)
            System.exit(0);
        else
            y=System.currentTimeMillis();
        return y;
    }
    
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        StopWatch sw= new StopWatch();
        while(true){
          System.out.println("Press any single key to start watch or press 0 to exit..");
          char c1= scan.next().charAt(0);
          int a= (int)c1;
          long x= sw.start(a);
          System.out.println("Enter any single key to stop watch or press 0 to exit..");
          char c2= scan.next().charAt(0);
          int b= (int)c2;
          long y=sw.stop(b);
          
          System.out.println("Time elapsed = "+ (y-x)/1000+" seconds");
          System.out.println("Press any key to continue or press 0 to exit");
          char c3=scan.next().charAt(0);
          int c= (int)c3;
          if(c==48)
            System.exit(0);
        }
    }
}