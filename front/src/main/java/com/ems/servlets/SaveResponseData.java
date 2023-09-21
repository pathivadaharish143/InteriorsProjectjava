package com.ems.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.ems.dao.customersDAO;
import com.ems.models.customers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveResponseData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name"); 
		String gmail = req.getParameter("gmail");
		String purpose = req.getParameter("purpose");
		String city = req.getParameter("city");
		String phoneNumber=req.getParameter("phoneNumber");
		PrintWriter out = resp.getWriter();
		/*
		 * out.println(name); out.println(gmail); out.println(purpose);
		 * out.println(city); out.println(gender); out.println(phoneNumber);
		 */
		
		customers cust = new customers();
		cust.setName(name);
		cust.setGmail(gmail);
		cust.setPurpose(purpose);
		cust.setCity(city);
		cust.setPhoneNumber(phoneNumber);
	
		
		customersDAO dao = new customersDAO();
		dao.registercustomer(cust);
		
		resp.sendRedirect("alert.html");
		}
	}