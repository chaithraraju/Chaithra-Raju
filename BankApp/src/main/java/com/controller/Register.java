package com.controller;

import java.io.IOException;






import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model1.Model1;
import com.project.Model.Model;



public class Register extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pwd = req.getParameter("pwd");
		String cpwd = req.getParameter("cpwd");
		if(pwd.equals(cpwd))
		{
			String accno = req.getParameter("accno");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String mobileno = req.getParameter("mobileno");
			String balance = req.getParameter("balance");
			
			Model1 m = new Model1();
			m.connect();
			int status = m.register(accno, name, email, mobileno, pwd, balance);
			if(status!=0)
			{
				resp.sendRedirect("/BankApp/successRegister.html");
			}
			else {
				resp.sendRedirect("/BankApp/failureRegister.html");
			}
		}
		else {
			resp.sendRedirect("/BankApp/passwordMismatch.html");
		}
	  }

	}


