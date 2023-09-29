package com.acaders.calculator;

import java.util.Scanner;
interface Mycalculator
{
	void addition();
	void subtraction();
}
class calculator1 implements Mycalculator
{
	public void addition()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public void subtraction()
	{
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println("Subtraction : "+c);
	}
}
class calculator2 implements Mycalculator
{
	Scanner sc = new Scanner(System.in);
	public void addition()
	{
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public void subtraction()
	{
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a-b;
		System.out.println("subtraction : "+c);
	}
}
class calculator3 implements Mycalculator
{
	Scanner sc = new Scanner(System.in);
	public void addition()
	{
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public void subtraction()
	{
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a-b;
		System.out.println("subtraction : "+c);
	}
}

public class Calculator 
{
public static void main(String[] args)
{
	calculator1 c1 = new calculator1();
	calculator2 c2 = new calculator2();
	calculator3 c3 = new calculator3();
	c1.addition();
	c1.subtraction();
	c2.addition();
	c2.subtraction();
	c3.addition();
	c3.subtraction();
	}
}
