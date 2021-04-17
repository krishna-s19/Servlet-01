package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApplicationServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		String name =req.getParameter("name").trim();
		String ages =req.getParameter("age").trim();
		System.out.println(ages);
		//int age = Integer.parseInt(ages);
		String address = req.getParameter("address").trim();
		
		
		
		// Server side validation
		
	System.out.println("Server side form validation ");
	List<String> errorsList = new ArrayList();
	
	if(name==null || name.length()==0||name.equals(""))
		errorsList.add("Person Name is required");
	else if(name.length()<10)
		errorsList.add("Person Name minimum 10 characters");
	
	int ager = 0;
	try {
		ager =Integer.parseInt("ages");
		System.out.println("age value       ::"+ager);
		
		if(ager <1 || ager>125)
				errorsList.add("Person age must here 1 to between 125 only");
			} 
		catch (NumberFormatException  e) {
		errorsList.add("Person age must be Numeric values only");
	}
	
	if(address==null||address.length()==0||address.equals(""))
		errorsList.add("Person address must required");
	
	// Displaying Errors List
	
	if(errorsList.size()!=0){
		pw.println("<ul style='color: Orange'>");
		for(String error : errorsList){
			pw.println("<li><b>"+error+"</b></li>");
		}
		pw.println("</ul>");
		
		return ;
	}
		
		if(ager>=18)
			pw.println("<h1 style='color:Green;text-align:center;'> Mrs/Mr/Miss "+name+"You are Eligale For Voting  </h1>");
		else
			pw.println("<h1 style='color:Green;text-align:center;'> Mrs/Mr/Miss "+name+"You are not  Eligale For Voting  </h1>");
			
		pw.println("<a href = 'form.html'><img src ='images/house.png'></a>");
	}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}
}
