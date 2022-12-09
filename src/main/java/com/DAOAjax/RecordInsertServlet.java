package com.DAOAjax;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(urlPatterns = {"/RecordInsertServlet"})
public class RecordInsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		InsertRec(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		InsertRec(req, resp);
	}
	
	void InsertRec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<br>");
		try {
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String gender=req.getParameter("gender");
			String address=req.getParameter("address");
			String city=req.getParameter("city");
			String pin=req.getParameter("pin");
			String mobileno=req.getParameter("mobileno");
			String qualification=req.getParameter("qualification");
			String designation=req.getParameter("designation");
			String specialization=req.getParameter("specialization");
			String birthdate=req.getParameter("birthdate");
			String joiningdate=req.getParameter("joiningdate");
			
			
			Teacher teacher=new Teacher();
			teacher.setFname(fname);
			teacher.setLname(lname);
			teacher.setGender(gender);
			teacher.setAddress(address);
			teacher.setCity(city);
			teacher.setPin(pin);
			teacher.setMobileno(mobileno);
			teacher.setQualification(qualification);
			teacher.setDesignation(designation);
			teacher.setSpecialization(specialization);
			teacher.setBirthdate(birthdate);
			teacher.setJoiningdate(joiningdate);
			teacher.setCurrentstatus("Active");
			
			TeacherDAO dao=TeacherDAOFactory.createTeacherDAO();
			String result=dao.Insert(teacher);
			out.println(result);
		}
		catch(Exception e) {
			out.println("<br>"+e.toString());
		}
		
	}
}
