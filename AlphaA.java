import java.util.Scanner;

public class AlphaA 
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
			  if(j==1 && i>n/2 || j==n && i>n/2 || i==n/2 || i+j==(n/2)+1 || j-i==n/2)
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
