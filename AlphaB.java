import java.util.Scanner;

public class AlphaB
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the no of rows");
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=1;j<=n;j++)
			  {
				  if(i==n && j!=n || i==n/2 && j!=n || i==1 && j<(3*n)/4 || j==1 || 
						  j==(3*n)/4 && i!=1 && i<=n/2 || j==n && i>n/2 && i!=n)
				  {
					  System.out.print("*");
				  }
				  else
				  {
					  System.out.print(" "); 
				  }
			  }
			  System.out.println();                                                                                                

	   }
	}
}
