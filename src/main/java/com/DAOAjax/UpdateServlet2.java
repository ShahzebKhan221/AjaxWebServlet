package com.DAOAjax;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/UpdateServlet2"})
public class UpdateServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		UpTeach(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		UpTeach(req, resp);
	}
	
	void UpTeach(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		try {
			int teacherid=Integer.parseInt(req.getParameter("teacherid"));
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
			out.println("<br>"+teacherid+", "+fname+", "+lname+", "+gender+", "+address+", "+city+", "+pin+", "+mobileno+", "+qualification+
					", "+designation+", "+specialization+", "+birthdate+", "+joiningdate);
			
			Teacher teacher=new Teacher();
			teacher.setTeacherid(teacherid);
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
			
			TeacherDAO dao=TeacherDAOFactory.createTeacherDAO();
			String res=dao.update(teacher);
			out.println(res);
		}
		catch(Exception e) {
			out.println("<br>"+e.toString());
		}
	}
}
