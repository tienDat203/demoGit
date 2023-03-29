package Demo.HelloWorld.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="login", urlPatterns = "/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get response writer
		PrintWriter writer = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username: " + username);
		System.out.println("password: " + password);

		// build HTML code
		String htmlRespone = "<html>";
		htmlRespone += "<h2>Your username is: " + username + "<br/>";
		htmlRespone += "Your password is: " + password + "</h2>";
		htmlRespone += "</html>";

		// return response
		writer.println(htmlRespone);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
