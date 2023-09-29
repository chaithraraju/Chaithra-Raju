package com.acaders.array;

import java.util.Scanner;

public class prog2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter the array values");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
				{
			System.out.println(a[i]);
				}

	}

}
