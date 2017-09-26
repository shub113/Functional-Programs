package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

class InputAndReplace{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1="Hello <<username>>,How are you?";
        System.out.println("Enter username..");
        String s2= sc.nextLine();
        char c[]=s2.toCharArray();
        if(c.length<3)
            System.out.println("Enter atleast 3 character");
        else{
            s1=s1.replace("<<username>>",s2);
            System.out.println(s1);
        }
    }
}