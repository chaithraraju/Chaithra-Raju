package com.acaders.array;

import java.util.Scanner;

public class prog6
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][][] = new int[3][][];
		a[0] = new int[2][];
		a[1] = new int[3][];
		a[2] = new int[4][];
		
		a[0][0] = new int[1];
		a[0][1] = new int[2];
		
		a[1][0] = new int[3];
		a[1][1] = new int[2];
		a[1][2] = new int[1];
		
		a[2][0] = new int[1];
		a[2][1] = new int[2];
		a[2][2] = new int[1];
		a[2][3] = new int[2];
		
		System.out.println("Enter array values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
				a[i][j][k] = sc.nextInt();
			}
		}
     }
		System.out.println("Entered array is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
				   System.out.print(a[i][j][k]+"    ");
			    }
			System.out.println();
			}
			System.out.println();
			System.out.println();
	       }
		}
}
