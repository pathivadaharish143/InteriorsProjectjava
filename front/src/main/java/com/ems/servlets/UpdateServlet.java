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
 * Servlet implementation class UpdateServlet
 */
@WebServlet(name = "update", urlPatterns = { "/update" })
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
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
				" <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">	    \r\n"
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
		out.println("<a href=\"responses\"class=\"nav-link\">BOOKING HISTORY</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item\">");
		out.println("<a href=\"AdminRegistration.html\"class=\"nav-link\">SIGN UP</a>");
		out.println("</li>");
		out.println("<li class=\"nav-item dropdown\">");
		out.println(
				"<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDarkDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">");
		out.println("<i class='fas fa-user-alt' style='font-size:34px;padding-left:97%;'></i></a>");
		out.println("<ul class=\"dropdown-menu dropdown-menu-dark\" aria-labelledby=\"navbarDarkDropdownMenuLink\">");
		out.println("<li><a class=\"dropdown-item\" href=\"#\">Edit Profile</a></li>");
		out.println("<li><a class=\"dropdown-item\" href=\"#\">Complaints</a></li>");
		out.println("<li><a class=\"dropdown-item\" href=\"Login.html\">Logout</a></li></ul>");
		out.println("</li>");
		out.println("</ul>");
		out.println("</nav>");
		out.println("</div>");
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO dao = new EmployeeDAO();
		Employee emp = dao.displayEmployee(id);
		System.out.println(emp.getEmpName());
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</head>\r\n" + "<body>\r\n" + "<div class=\"container\">\r\n"
				+ "   <form method=\"Post\" action=\"edit\">\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Employee Id</label>\r\n"
				+ "          <input type=\"number\" name=\"empId\" placeholder=\"Enter employee ID\" class=\"form-control\" disabled value="
				+ emp.getEmpId() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Employee Name</label>\r\n"
				+ "          <input type=\"text\" name=\"empName\" placeholder=\"Enter employee Name\" class=\"form-control\" value="
				+ emp.getEmpName() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Employee's Role</label>\r\n"
				+ "          <input type=\"text\" name=\"empRole\" placeholder=\"Enter employee Role\" class=\"form-control\" value="
				+ emp.getRole() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Department Id</label>\r\n"
				+ "          <input type=\"number\" name=\"deptId\" placeholder=\"Enter Department ID\" class=\"form-control\" disabled value="
				+ emp.getDeptId() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Employee Name</label>\r\n"
				+ "          <input type=\"text\" name=\"gmail\" placeholder=\"Enter the gmail id\" class=\"form-control\" value="
				+ emp.getGmail() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n"
				+ "          <label>Employee Password</label>\r\n"
				+ "          <input type=\"password\" name=\"pass\" placeholder=\"Enter employee password\" class=\"form-control\" disabled value="
				+ emp.getPass() + " />\r\n" + "      </div>\r\n" + "      <div class=\"mb-3\">\r\n" + "      </div>\r\n"
				+ "      <div class=\"text-end\">\r\n"
				+ "          <button type=\"submit\" class=\"btn btn-success\">Update Profile</button>\r\n"
				+ "      </div>\r\n" + "   </form>\r\n" + "   </div>\r\n");
		out.println("<div class=\"div4\">");
		out.println("<div class=\"container4-fluid\">");
		out.println("<div align=\"center\">");
		out.println("<img src=\"images/logo1.jpg \" class=\"imagelogo1\"/>");
		out.println("</div>");
		out.println("<div align=\"center\">");
		out.println("<div class=\"container4-fluid\">");
		out.println(" <h6  align=\"center\"><b>Tech Support</b></b></h6>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Harish</p>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Yellamanchili,</p>");
		out.println("<p align=\"center\"class=u-full-width-footer>Visakhapatnam,India,531055.</P></br>");
		out.println("<p align=\"center\"class=u-full-width-footer>8985196314</P>");
		out.println("  <p align=\"center\"class=u-full-width-footer>pathivadaharish00@gmail.com</P>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Contact now</P>  </br>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Opening Hours:</P>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Mon to Fri 9.00am - 5.30pm</P>");
		out.println(" <p align=\"center\"class=u-full-width-footer>Privacy Policy</P></br>");
		out.println("<p align=\"center\"class=u-full-width-footer>All rights reserved</P>");
		out.println("<p align=\"center\"class=u-full-width-footer>Design by Harish robert</P>");
		out.println(" <p align=\"center\"class=u-full-width-footer>pathivadaharish00@gmail.com</P>\r\n" + "");
		out.println("<div class=\"containerdegsin-lg\">");
		out.println("  <p align=\"center\"> &copy; All rights reserved</p>");
		out.println("<p><h2 align=\"center\">Designed by  Harish  Robert</h2></p>");
		out.println("</div> ");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
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
