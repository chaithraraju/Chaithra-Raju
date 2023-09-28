import java.util.Scanner;

public class AlphaV 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the no of rows");
		  int n=sc.nextInt();
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=9;j++)
			  {
				  if(i==j || j+i==10) 
				  
					  System.out.print("*");
				  else
				   System.out.print(" "); 
				  
			  }
			  System.out.println();                                                                                                

	   }
	}
}
