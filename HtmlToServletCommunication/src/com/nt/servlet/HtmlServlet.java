package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HtmlServlet  extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		Properties props = System.getProperties();
			
		pw.println(props);
		pw.println("<a href='page.html'><img src='house.png'></a>");
		pw.close();
			
		}
	}
