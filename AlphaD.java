import java.util.Scanner;

public class AlphaD 
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
				  if(j==1 || i==1 && j<=(n/2)+3 ||  i==n && j<=(n/2)+3 || i!=1 && i!=n && j==n )
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
