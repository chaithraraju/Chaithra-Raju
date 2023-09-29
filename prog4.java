package com.acaders.array;

import java.util.Scanner;

public class prog4 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][][] = new int[2][3][5];
		      for(int i=0;i<=1;i++)
		{
            	  for (int j=0;j<=2;j++)
            	  {
            		  for(int k=0;k<=4;k++)
            		  {
           	  	  System.out.println("enter the  value : ");
            			a[i][j][k] = sc.nextInt();
            	  }
		}
	}
		      System.out.println("the entered array is :   ");
		      for(int i=0;i<=2;i++)
		      {
		    	  for(int j=0;j<=4;j++)
		    	  {
		    		  for(int k=0;k<=4;k++)
		    		  {
		    			  System.out.print(a[i][j][k]+"       ");
		    		  }
		    	          System.out.println();		  
                  }
		
			System.out.println();
			System.out.println();
		      }
	       }

        }
