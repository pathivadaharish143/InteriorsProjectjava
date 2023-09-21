package com.ems.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import com.ems.dao.EmployeeDAO;
import com.ems.models.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveEmpData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("empId")); 
		int empSal = Integer.parseInt(req.getParameter("salary")); 
		int deptId = Integer.parseInt(req.getParameter("deptId"));
		String name = req.getParameter("empName");
		String gender = req.getParameter("gender");
		String role = req.getParameter("empRole");
		String pass=req.getParameter("pass");
		String gmail=req.getParameter("gmail");
		PrintWriter out = resp.getWriter();
		
		
		Employee emp = new Employee();
		emp.setEmpId(num);
		emp.setSalary(empSal);
		emp.setDeptId(deptId);
		emp.setEmpName(name);
		emp.setGender(gender);
		emp.setRole(role);
		emp.setPass(pass);
		emp.setGmail(gmail);
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.registerEmployee(emp);
		
		resp.sendRedirect("AvailableEmployees");
	}
}
