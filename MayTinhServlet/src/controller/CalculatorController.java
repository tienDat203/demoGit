package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet(name= "caculator", urlPatterns="/caculator")
public class CalculatorController extends HttpServlet {
	private Double cal(double n1, double n2, String o) {
		double result =0;
		switch (o) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case ":":
			result=n1/n2;
			break;
		default:
			break;
		}
		return result;
	}
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();  
		
		String num1= request.getParameter("num1");
		String num2= request.getParameter("num2");
		String option= request.getParameter("option");
		
		double n1= Double.parseDouble(num1);
		double n2= Double.parseDouble(num2);
		
		try {
			String caculate = String.valueOf(cal(n1, n2,option));
			
			// build HTML code
			String htmlRespone = "<html>";
			htmlRespone += "<h2>Your result is: " + caculate + "<br/>";
			htmlRespone += "</html>";

			// return response
			writer.println(htmlRespone);
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
