package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model1.Model1;


public class TransferMoney extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String raccno=req.getParameter("raccno");
		String amount=req.getParameter("amount");
		String balance=(String) session.getAttribute("balance");
		if(Integer.parseInt(balance)>Integer.parseInt(amount)) {
			
		Model1 m = new Model1();
		m.connect();
		int x = m.validAccountno(raccno);
		
		if(x==1)
		{
			String accno=(String) session.getAttribute("accno");
			
			int status = m.transferMoney(accno,raccno,amount);
			if(status!=0) {
				resp.sendRedirect("/BankApp/successTransfer.html");
			}
			else {
				resp.sendRedirect("/BankApp/failTransfer.html");
			}
		}
		else {
			resp.sendRedirect("/BankApp/invalidReceiver.html");
		}
	}
	else {
		 resp.sendRedirect("/BankApp/insufficientFunds.html");
	}
}
}
