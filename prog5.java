package com.acaders.array;

import java.util.Scanner;

public class prog5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];
		System.out.println("Enter array values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered array is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		  }
		 }
       }
