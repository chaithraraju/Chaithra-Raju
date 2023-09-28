package com.acaders.practice;

import java.util.ArrayList;
import java.util.Scanner;

class TicTacToeGame
{
	static void showBoard(char board[][])
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				System.out.println(board[i][j]);
			}
			System.out.println();
			
		}
	}
	static void insert(int pos,char board[][],char sym)
	{
		switch(pos)
		{
		case 1: board[1][1]=sym;
		break;
		case 2: board[1][3]=sym;
		break;
		case 3: board[1][5]=sym;
		break;
		
		case 4: board[3][1]=sym;
		break;
		case 5: board[3][3]=sym;
		break;
		case 6: board[3][5]=sym;
		break;
		
		case 7: board[5][1]=sym;
		break;
		case 8: board[5][3]=sym;
		break;
		case 9: board[5][5]=sym;
		break;
		default: System.out.println("Invalid position");
		}
		if(sym=='x')
		{
			 TicTacToe.allp1pos.add(pos);
		}
		else if(sym=='o')
		{
			 TicTacToe.allp2pos.add(pos);
		}
	}
}


public class TicTacToe 
{
	static ArrayList allp1pos = new ArrayList();
	static ArrayList allp2pos = new ArrayList();
	 public static void main(String[] args)
	    {
		int player1pos, player2pos;
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter player Names");
		System.out.println("player 1 : ");
		String p1 = sc.nextLine();
		System.out.println("player 2 : ");
		String p2 = sc.nextLine();
		
		char board[][] = {{'_','_','_','_','_','_','_'},
				{'|',' ','|',' ','|',' ','|'},
				{'|','-','+','-','+','-','|'},
				{'|',' ','|',' ','|',' ','|'},
				{'|','-','+','-','+','-','|'},
				{'|',' ','|',' ','|',' ','|'},
				{'-','-','-','-','-','-','-'}};
		TicTacToe.showBoard(board);
		
		while(true)
		{
			System.out.println(p1+": Enter the position(1-9) to place 'x' ");
			player1pos = sc.nextInt();
			while(allp1pos.contains(player1pos) || allp2pos.contains(player2pos))
			{
				System.out.println("Position already taken: Re-enter ");
				  player1pos = sc.nextInt();
			}
			TicTacToe.insert(player1pos, board,'x');
			TicTacToe.showBoard(board);
			
			
			System.out.println(p1+": Enter the position(1-9) to place 'o' ");
			player2pos = sc.nextInt();
			while(allp1pos.contains(player1pos) || allp2pos.contains(player2pos))
			{
				System.out.println("Position already taken: Re-enter ");
				player2pos = sc.nextInt();
			}
			TicTacToe.insert(player2pos, board,'x');
			TicTacToe.showBoard(board);
		  }
		}
}
