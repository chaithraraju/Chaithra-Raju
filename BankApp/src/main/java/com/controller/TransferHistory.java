package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model1.Model1;

public class TransferHistory extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String accno = (String) session.getAttribute("accno");
		Model1 m = new Model1();
		m.connect();
		m.transferHistory(accno);
		List raccnoList = m.raccnoList;
		List amountList = m.amountList;
		
		session.setAttribute("raccnoList", raccnoList);
		session.setAttribute("amountList", amountList);
		
		resp.sendRedirect("/BankApp/showTransferHistory.jsp");
		
	}
}
