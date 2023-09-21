package com.ems.servlets;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.ems.dao.EmployeeDAO;
import com.ems.models.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditProfile
 */
@WebServlet(name = "edit", urlPatterns = { "/edit" })
public class EditProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = req.getParameter("empName");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");
		String role = req.getParameter("empRole");
		String gmail = req.getParameter("gmail");
		PrintWriter out = resp.getWriter();
		
		Employee emp = new Employee();

		emp.setEmpName(name);
		emp.setGender(gender);
		emp.setPass(pass);
		emp.setRole(role);

		emp.setGmail(gmail);

		EmployeeDAO dao = new EmployeeDAO();
		dao.updateEmployee(emp);
		
		resp.sendRedirect("AvailableEmployees");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
