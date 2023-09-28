import java.util.Scanner;

public class AlphaK 
{
	public static void main(String[] args)
	{
		 int k=-1;
		  for(int r=1;r<=7;r++)
		  {
			  for(int c=1;c<=4;c++)
			  {
				  if(c==1 || r+c==5 || (r>4 && r+c==k))
				   System.out.print("*");
				  else
				    System.out.print(" "); 
				  }
			        System.out.println();  
			        k=k+2;
         }
	  }

  }



