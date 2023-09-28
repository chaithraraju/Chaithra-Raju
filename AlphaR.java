
public class AlphaR 
{
	public static void main(String[] args) 
	{
		 int n=10;
		  for(int i=1;i<=10;i++)
		  {
			  for(int j=(n/2)+1;j<=n;j++)
			  {
				  if(j==(n/2)+1 || i==1 && j!=n || i==j || i==n/2 && j!=n || j==n && i!=1 && i<=n/2)
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
