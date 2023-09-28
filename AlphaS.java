import java.util.Scanner;

public class AlphaS 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the no of rows");
		  int n=sc.nextInt();
		  for(int i=1;i<=10;i++)
		  {
			  for(int j=1;j<=10;j++)
			  {
				  if(i==1 || i==5 || i==n || (i==2 & j==1) || (i==3 & j==1) || (i==4 & j==1) || (i==6 & j==n) ||
						  (i==7 & j==n)|| (i==8 & j==n)|| (i==9 & j==n)  )
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
