import java.util.Scanner;

public class AlphaW 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the no of rows");
		  int n=sc.nextInt();
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=5;j++)
			  {
				  if(j==1  || j==n  || (i==j & i>2) || (i==4 & j==2) )
				  
					  System.out.print("*");
				 
				  else
				  {
					  System.out.print(" "); 
				  }
			  }
			  System.out.println();                                                                                                

	   }
	}
}
