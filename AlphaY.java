import java.util.Scanner;

public class AlphaY 
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
				  if((i==j & i<=3) || (j==3 & i>3) || (i+j==6 & i<=3))
				  
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
