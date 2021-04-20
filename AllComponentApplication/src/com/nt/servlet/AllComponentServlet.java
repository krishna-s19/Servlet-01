package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllComponentServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String ms =req.getParameter("ms");
		String qlfy = req.getParameter("qlfy");
		String favCities[] = req.getParameterValues("cities");
		String hbs[] = req.getParameterValues("hb");
		String dob = req.getParameter("date");
		String color= req.getParameter("color");
		String email = req.getParameter("email");
		String url = req.getParameter("url");
		long mobile =Long.parseLong(req.getParameter("mobileNo"));
		double  salary = Double.parseDouble(req.getParameter("salary"));
		String week = req.getParameter("week");
		String month = req.getParameter("month");
		
		
		if(ms==null){
			ms="single";
		}
		
		if(hbs==null)
			hbs= new String[]{"No Hobbies are Selected"};
		
		if(favCities==null)
			favCities = new String[]{"No Fav Citie Selected"};
		
		
		if (gender.equalsIgnoreCase("M")){
			if(age<5)
				pw.println("<h1 style='color:Green'>Master.   "+name+"You are baby Boy</h1>");
			else if(age<13)
				pw.println("<h1 style='color:Green'>Master.   "+name+"    You are Small Boy</h1>");
			else if(age<20)
				pw.println("<h1 style='color:Green'>Master   ."+name+"   You are Teenage Boy</h1>");
			else if(age<35)
				pw.println("<h1 style='color:Green'>Mr.   "+name+"    You are young  Man</h1>");
			else if(age<50)
				pw.println("<h1 style='color:Green'>Master.   "+name+"  You are Middileaged  Man</h1>");
			else 
				pw.println("<h1 style='color:Green'>Master.    "+name+"   You are Old</h1>");
				}
		else{
			if(age<5)
			pw.println("<h1 style='color:Green'>Master.    "+name+"   You are baby Girl</h1>");
			else if(age<13)
			pw.println("<h1 style='color:Green'>Master.    "+name+"  You are Small Girl</h1>");
			else if(age<20){
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color:Green'>Miss.    "+name+"   You are Married Teenage Girl</h1>");
					else
				pw.println("<h1 style='color:Green'>Mr.   "+name+"   You are Teenage Boy</h1>");
			}
		else if(age<35){
			if(ms.equalsIgnoreCase("married"))
			pw.println("<h1 style='color:Green'>Miss"+name+"   You are  young  Women</h1>");
			else
				pw.println("<h1 style='color:Green'>Mr"+name+"   You are  young  Women</h1>");
		}
			else if(age<50){
			if(ms.equalsIgnoreCase("married"))
			pw.println("<h1 style='color:Green'>Miss.   "+name+"   You are Middileaged Women</h1>");
		else 
			pw.println("<h1 style='color:Green'>Mr.   "+name+"  You are Middileaged Women</h1>");
			}
			else {
				if(ms.equalsIgnoreCase("married"))
						pw.println("<h1 style='color:Green'>Miss.   "+name+"   You are old Women</h1>");
				else
			pw.println("<h1 style='color:Green'>Mr.       "+name+"  You are Old Women</h1>");
			}
		}
		pw.println("<h2 style='color:red;text-align:center;'> Form Data </h2>");
		pw.println("<br><b> name :: "+name+"</b>");
		pw.println("<br><b> age :: "+age+"</b>");
		pw.println("<br><b> address :: "+address+"</b>");
		pw.println("<br><b> Marital status  :: "+ms+"</b>");
		pw.println("<br><b> Gender :: "+gender+"</b>");
		pw.println("<br><b>  Qualification:: "+qlfy+"</b>");
		pw.println("<br><b> Fav Cities :: "+Arrays.toString(favCities)+"</b>");
		pw.println("<br><b> Hobbiess  :: "+Arrays.toString(hbs)+"</b>");
		pw.println("<br><b> DOB :: "+dob+"</b>");
		pw.println("<br><b> Date of month :: "+month+"</b>");
		pw.println("<br><b> Date of  Weeek :: "+week+"</b>");
		pw.println("<br><b> MoblieNumber :: "+mobile+"</b>");
		pw.println("<br><b> Salary :: "+salary+"</b>");
		pw.println("<br><b> ChosenColor :: "+color+"</b>");
		pw.println("<br><b> Email :: "+email+"</b>");
		pw.println("<br><b> FbUrl :: "+url+"</b>");
	
		pw.println("<br><a  href='Form.html'> home </a> ");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	
	}
}
