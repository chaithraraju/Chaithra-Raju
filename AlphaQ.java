
public class AlphaQ 
{
	public static void main(String[] args)
	{
		int n=10;
		  for(int i=1;i<=10;i++)
		  {
			  for(int j=1;j<=n;j++)
			  {
				  if(i==1 && j!=1 && j<(3*n)/4 || i==(3*n)/4 && j!=1 && j<(3*n)/4 || j==1 && i!=1 && i<(3*n)/4
						  || j==(3*n)/4 && i!=1 && i<(3*n)/4 || i==j && i>=n/2)
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
