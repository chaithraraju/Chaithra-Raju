package com.model1;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class Model1 {
	public List raccnoList = new ArrayList();
	public List amountList = new ArrayList();
	public String accno, name, email, mobileno, password, balance;
    String url="jdbc:mysql://localhost:3306/project1", un="root", pwd="admin";
    Connection con;
    PreparedStatement pstmt;
    ResultSet res;
    public void connect() {
  	  try {
  		  Class.forName("com.mysql.cj.jdbc.Driver");
  			 con = DriverManager.getConnection(url,un,pwd);
  	  }
  	  catch(Exception e)
  	  {
  		  e.printStackTrace();
  	  }
    }
    public int register(String accno, String name, String email, String mobileno, String pwd, String balance) {
    	try {
    		String s = "Insert into customer values(?,?,?,?,?,?)";
    				pstmt = con.prepareStatement(s);
    		pstmt.setString(1, accno);
    		pstmt.setString(2, name);
    		pstmt.setString(3, email);
    		pstmt.setString(4, mobileno);
    		pstmt.setString(5, pwd);
    		pstmt.setString(6, balance);
    		
    		int x = pstmt.executeUpdate();
    		return x;
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0;
    }
    
    public int login(String email, String pwd) {
		try {
			String s = "select * from customer where"+ " email=? and password=?";
			pstmt=con.prepareStatement(s);
			pstmt.setString(1, email);
			pstmt.setString(2, pwd);
			res = pstmt.executeQuery();
			
			while(res.next())
			{
				 accno = res.getString("accno");
				name = res.getString("name");
				mobileno = res.getString("mobileno");
				balance = res.getString("balance");
				 
				 return 1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
    public int validAccountno(String raccno) {
		try {
			String s = "select * from customer where accno=?";
			pstmt=con.prepareStatement(s);
			pstmt.setString(1, raccno);
			res = pstmt.executeQuery();
			if(res.next())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	
	}
	
	public int transferMoney(String accno, String raccno, String amount) {
		try {
			String s= "Update customer set balance=balance+? where accno=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, amount);
			pstmt.setString(2, raccno);
			pstmt.executeUpdate();
			
		  s= "Update customer set balance=balance-? where accno=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, amount);
			pstmt.setString(2, accno);
			pstmt.executeUpdate();
		
			
			s = "insert into statement values(?,?,?)";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, accno);
			pstmt.setString(2, raccno);
			pstmt.setString(3, amount);
			int x = pstmt.executeUpdate();
		return x;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public void transferHistory(String accno) {
		try {
			String s = "Select * from statement where saccno=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, accno);
			res = pstmt.executeQuery();
			while(res.next()) {
				raccnoList.add(res.getString("raccno"));
				amountList.add(res.getString("amount"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public int updateDetails(String name, String mobileno, String email) {
		try {
			String s = "update customer set name=?,mobileno=? where email=?";
			pstmt=con.prepareStatement(s);
		pstmt.setString(1, name);
		pstmt.setString(2, mobileno);
		pstmt.setString(3, email);
		
		int x = pstmt.executeUpdate();
		return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
}
