import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData 
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/MyDatabase";
		String un = "root";
		String pwd = "admin";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,un,pwd);
			System.out.println("Connection is established at : "+con);
			String s = "Delete from student where id=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			System.out.println("Enter the ID");
			Scanner sc = new Scanner (System.in);
			String id = sc.nextLine();
			pstmt.setString(1, id);
			
			int x = pstmt.executeUpdate();
			if(x!=0)
			{
				System.out.println("Data Deleted");
			}
			else {
				System.out.println("Its a failure");
			}
		}
			catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
