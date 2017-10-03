package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

import com.bridgeit.FunctionPrograms.utility.Input;

class TwoDArray{
	Input input= new Input();
	static Scanner scan= new Scanner(System.in);
    public static void main(String[]arg){
       TwoDArray obj= new TwoDArray();
       try{
    	   System.out.println("Enter row ");
           int row=scan.nextInt();
           System.out.println("Enter column");
           int column= scan.nextInt();
           System.out.println("1) Integer");
           System.out.println("2) Double ");
           System.out.println("3) Boolean");
           System.out.println("Enter choice");
           int choice= scan.nextInt();
           input(row,column,choice);
       }catch(Exception e){
    	   e.printStackTrace();
       }
    }
    static <T> void input(int row,int column,int choice){
    	ArrayList<ArrayList<T>> array=new ArrayList<ArrayList<T>>();
    	for(int i=0;i<row;i++){
    			array.add(new ArrayList<T>());
    	}
    	try{
    		for(int i=0;i<row;i++){
        		for(int j=0;j<column;j++){
        			if(choice==1)
        				array.get(i).add((T) Integer.valueOf(scan.nextInt()));
        			else if(choice==2)
        				array.get(i).add((T) Double.valueOf(scan.nextDouble()));
        			else
        				array.get(i).add((T) Boolean.valueOf(scan.nextBoolean()));
        		}
        	}
    	}catch(Exception e){
    		System.out.println(e);
    	}
    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			System.out.print(array.get(i).get(j)+"\t");
    		}System.out.println();
    	}
    }
    
   /* public void displayDouble(int row,int column){
    	int[][] array= new int[row][column];
    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			array[i][j]=input.integerInput();
    		}
    	}
    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			System.out.print(array[i][j]+"\t");
    		}
    		System.out.println();
    	}
    }
    
    public void displayBoolean(int row,int column){
    	int[][] array= new int[row][column];
    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			array[i][j]=input.integerInput();
    		}
    	}
    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			System.out.print(array[i][j]+"\t");
    		}
    		System.out.println();
    	}
    }*/
}