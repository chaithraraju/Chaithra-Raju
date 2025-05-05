package com.acaders.practices;

import java.util.Scanner;

public class Hotelbill 
{
     public static void main(String[] args)
      {
    	 char ch;
    	 String itemName="";
    	 float cost=0.0f, subtotal = 0.0f;
    	 int slno,quantity;
    	 Scanner sc = new Scanner(System.in);
	System.out.println(" __________________________\n"
			+ "|       M  E  N  U         |\n"
		    + "|__________________________|\n"
			+ "|SLNO     ITEM         COST|\n"
		    + "|__________________________|\n"
			+ "|1        Idly           20|\n"
		    + "|2        Dosa           50|\n"
			+ "|3        Poori          40|\n"
		    + "|4        Vada           30|\n"
			+ "|5        Coffee         10|\n"
		    + "|6        Water          20|\n"
			+ "|__________________________|\n"
		    + "|__________________________|");
	
	System.out.println("Enter the item of your choice: ");
	int slno = sc.nextInt();
	System.out.print("Enter the quantity : ");
	quantity = sc.nextInt();
	
      }
    }

         switch(slno)
         {
         case 1: itemName="Idly  ";
         cost=20;
         break;
         case 2: itemName="Dosa  ";
         cost=50;
         break;
         case 3: itemName="poori ";
         cost=40;
         break;
         case 4: itemName="Vada  ";
         cost=30;
         break;
         case 5: itemName="Coffee";
         cost=10;
         break;
         case 6: itemName="Water ";
         cost=20;
         break;
         default:
        	 System.out.println("Wrong Item No");
        	 
         }
         grandTotal = grandTotal+subtotal;
       System.out.println(+itemName+"   "+cost+"   "+quantity+"   "+subtotal);
     System.out.println("Do you want to buy anything more?\nType 'Y' for more :");
     ch = sc.next().toUpperCase().charAt(0);
     
     }
     }
     