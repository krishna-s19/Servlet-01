package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	
	
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//	PrintWriter pw = resp.getWriter();
//	resp.setContentType("text/html");
	
	
//	pw.println("<h1 style='color:tomato;text-align:center;'> Home Servlet Page </h1> ");
	
//	pw.close();
	
//	}
	
	
//	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		PrintWriter pw = resp.getWriter();
//		resp.setContentType("text/html");
//		String name= req.getParameter("name");
//		int age = Integer.parseInt(req.getParameter("age"));
//		String address = req.getParameter("address");
//		System.out.println("HomeServlet.service()          ::");
//		if(age>=18)
//			pw.println("<h1 style='color:tomato;text-align:center'>"+name+"  you are eligable for voting  </h1>" );
//		else
//			pw.println("<h1 style='color:tomato;text-align:center'>"+name+"  you are not eligable for voting  </h1>" );
//		pw.println("<h1><a href='form.html'><img src='images/house.png'></a> </h1>" );
//			pw.close();
//	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println(" Home Servlet VoterServlet.do     Post()                                ::");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		String name= req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		
			
		if(age>=18)
			pw.println("<h1 style='color:tomato;text-align:center'>"+name+"  you are eligable for voting  </h1>" );
		else
			pw.println("<h1 style='color:tomato;text-align:center'>"+name+"  you are not eligable for voting  </h1>" );

		pw.println("<h1><a href='form.html'><img src='images/house.png'></a> </h1>" );
		pw.close();
		
		}
		
		@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				
					System.out.println(" Home Servlet  VoterServlet.do  Get()                                  ::");
					PrintWriter pw = res.getWriter();
					res.setContentType("text/html");
					
					
					Date d = new Date();
					
					pw.println("<h1 style='color:tomato;text-align:center'>system Date and Time"+ d +" </h1>");
					pw.println("<h1><a href='form.html'><img src='images/house.png'></a> </h1>" );
					
					
			}
	
	
	
	
}
