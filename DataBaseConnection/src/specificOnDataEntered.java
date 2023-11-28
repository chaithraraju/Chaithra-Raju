import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class specificOnDataEntered 
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
			String s = "select * from student where id=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			System.out.println("Enter the ID whose details should be fetched");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			pstmt.setString(1, id);
			ResultSet res =  pstmt.executeQuery();
			
			while(res.next()==true)
			{
				String id1 = res.getString(1);
				String name = res.getString(2);
				String m1 = res.getString(3);
				String m2 = res.getString(4);
				String m3 = res.getString(5);
				
				System.out.println(id1+"    "+name+"     "+m1+"    "+m2+"     "+m3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
