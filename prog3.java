package com.acaders.array;

import java.util.Scanner;

public class prog3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][5];
		      for(int i=0;i<=2;i++)
		{
            	  for (int j=0;j<=4;j++)
            	  {
            		  System.out.println("enter the  value : ");
            			a[i][j] = sc.nextInt();
            	  }
		}
		      System.out.println("the entered array is :   ");

		      for(int i=0;i<=2;i++)
		      {
		    	  for(int j=0;j<=4;j++)
		    	  {
                     System.out.print(a[i][j]+"          ");		  
                  }
		
			System.out.println();
		}
	}
}
