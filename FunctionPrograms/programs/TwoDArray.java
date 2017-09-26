package com.bridgeit.FunctionPrograms.programs;

import java.util.*;

import com.bridgeit.FunctionPrograms.utility.Input;

class TwoDArray{
	Input input= new Input();
    public static void main(String[]arg){
       Scanner scan= new Scanner(System.in);
       TwoDArray obj= new TwoDArray();
       System.out.println("Enter row ");
       int row=scan.nextInt();
       System.out.println("Enter column");
       int column= scan.nextInt();
       System.out.println("1) Integer");
       System.out.println("2) Double ");
       System.out.println("3) Boolean");
       System.out.println("Enter choice");
       int choice= scan.nextInt();
       switch(choice){
       case 1:
    	   obj.displayInteger(row, column);
    	   break;
       case 2:
    	   obj.displayDouble(row, column);
    	   break;
       case 3:
    	   obj.displayBoolean(row, column);
    	   break;
       default:
    		   System.out.println("Invalid choice");
       }
    }
    public void displayInteger(int row,int column){
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
    public void displayDouble(int row,int column){
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
    }
}