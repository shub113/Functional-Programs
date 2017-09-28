package com.bridgeit.FunctionPrograms.programs;

import java.util.Scanner;

import com.bridgeit.FunctionPrograms.utility.TicTacToeGame;

public class TicTacToe {
	
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		 char [][]ticTacToeArray=new char[3][3];
		try {
			   for(int i=0;i<3;i++) {
		
			      for(int j=0;j<3;j++) {
				      ticTacToeArray[i][j]=' ';
			        }
		           }
				TicTacToeGame g=new TicTacToeGame();
				char[][]finalTableArray=g.launchGame(ticTacToeArray);
				boolean winner=g.isUserWinner(finalTableArray);
				if(winner==false) {
					if(finalTableArray.length==3)
				
		   	        {
						//g.displayBoard(finalTableArray);
			    	    System.out.println("\"Match is Drawn\"");	
			    	    System.exit(0);
			    	 }
				}
		  }
		  catch(Exception ex)
		  {
			 System.out.println("The \" "+ex+" \" Exception is raised");
		  }
	}
}
