package com.ems.servlets;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.models.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AvailableEmployees
 */

//@WebServlet("/url")

@WebServlet("/AvailableEmployees")
public class AvailableEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> empList = dao.displayEmployee();
		// Use RequestDispatcher to redirect to a new jsp ir html page

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println(
				"<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css'/>");
		out.println(
				"<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css'/>");
		out.println(
				"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<link rel=\"stylesheet\" href=\"styles1.css\"/>");
		out.println("<style>");
		out.println(".nav-link{");
		out.println("padding-left:20%;");
		out.println("color:white;");
		out.println("font-size: 20px;");
		out.println("}");
		out.println(".navbar-dark{");
		out.println(" height:1%;");
		out.println(" width:auto;");
		out.println("background-color: #51555E;");
		out.println("padding-left:16%;");
		out.println("padding-top:2%;");
		out.println("}");
		out.println(".navbar-brand{");
		out.println("font-family:Lucida Handwriting;");
		out.println("font-size: 20px;");
		out.println("line-height: 32px;");
		out.println(" color: #FFFFFF; ");
		out.println("text-decoration: none;");
		out.println("font-weight: 400;");
		out.println(" }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id=\"div1\">");
		out.println("<div class='container-lg'>");
		out.println("<div class=\"row\">");
		out.println("<div class=\"col-lg-2\">");
		out.println("<div align=\"center\">");
		out.println("<img src=\"images/logo1.jpg \" class=\"imagelogo\"/>");
		out.println(" </div>");
		out.println(" </div>");
		out.println("<div class=\"col-lg-4\">");
		out.println("</div>");
		out.println(" <div class=\"col-lg-6\">");
		out.println("<div align=\"center\"  class=\"strapline\">");
		out.println("Lehara Interiors");
		out.println("</br>");
		out.println(
				"<p class=\"telephone1\"><i class=\"fas fa-mobile-alt\" style=\"font-size:36px\"></i><b>08885732666</b></p>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("<div id=\"div2\">");
		out.println("<nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n" + "");
		out.println("<div class=\"container-fluid\">");
		out.println("<a class=\"navbar-brand\" href=\"#\"></a>");
		out.println(
				"<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">	    \r\n"
						+ "");
		out.println(" <span class=\"navbar-toggler-icon\"></span>");

		out.println("</button>");
		out.println("<div class=\"collapse navbar-collapse\" id=\"navbarNav\">");
		out.println("<ul class=\"navbar-nav\">");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"AvailableEmployees\" class=\"nav-link\">ADMIN</a>");
		out.println("</li>");
		out.println("<a href=\"responses\"class=\"nav-link\">RESPONSES</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"responses\"class=\"nav-link\">FEEDBACKS</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"responses\" class=\"nav-link\">UPDATES</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"responses\"class=\"nav-link\">HISTORY</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"AdminRegistration.html\"class=\"nav-link\">SIGNUP</a>");
		out.println("</li>");
		out.println("<form class=\"d-flex\">");
		out.println("<input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">");
		out.println("<button class=\"btn btn-outline-success\" type=\"submit\">Search</button>");
		out.println(" </form>");
		out.println("<li class=\"nav-item dropdown\">");
		out.println(
				"<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDarkDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">");
		out.println("<i class='fas fa-user-alt' style='font-size:34px;padding-left:25%;padding-bottom:15px;'></i></a>");
		out.println("<ul class=\"dropdown-menu dropdown-menu-dark\" aria-labelledby=\"navbarDarkDropdownMenuLink\">");
		out.println("<li><a class=\"dropdown-item\" href=\"#\">Edit Profile</a></li>");
		out.println("<li><a class=\"dropdown-item\" href=\"#\">Complaints</a></li>");
		out.println("<li><a class=\"dropdown-item\" href=\"Login.html\">Logout</a></li></ul>");
		out.println("</li>");
		out.println("</ul>");
		out.println("</nav>");
		out.println("</div>");
		out.println("</div>");

		out.println("<div style=\"overflow-x:auto;\">");
		out.println("<div class='container'>");
		out.println("<table class='table table-hover'");
		out.println("<thead class='bg-primary'>");
		out.println("<tr>");
		out.println("<th>Employee ID</th>");
		out.println("<th>Employee Name</th>");
		out.println("<th>Gender</th>");
		out.println("<th>Salary</th>");
		out.println("<th>Role</th>");
		out.println("<th>Gmail</th>");
		out.println("<th></th>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		for (Employee emp : empList) {
			out.println("<tr>");
			out.println("<td>" + emp.getEmpId() + "</td>");
			out.println("<td>" + emp.getEmpName() + "</td>");
			out.println("<td>" + emp.getGender() + "</td>");
			out.println("<td>" + emp.getSalary() + "</td>");
			out.println("<td>" + emp.getRole() + "</td>");
			out.println("<td>" + emp.getGmail() + "</td>");
			out.println("<td><a class='btn btn-info' href='update?id=" + emp.getEmpId()
					+ "'><i class=\"fa-solid fa-user-pen\"></i></a> <a class='btn btn-danger' href='delEmployee?id="
					+ emp.getEmpId() + "'><i class=\"fa-solid fa-user-pen\"></i></a></td>");
			out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("<table/>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");

		out.println("</html>");
	}
}
