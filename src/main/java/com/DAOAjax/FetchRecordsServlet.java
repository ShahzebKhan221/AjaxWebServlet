package com.DAOAjax;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/FetchRecordsServlet"})
public class FetchRecordsServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		FetchAll(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<p class='heading-table' >Available Records Table<p>");
		FetchAll(req, resp);
	}

	void FetchAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		TeacherDAO dao=TeacherDAOFactory.createTeacherDAO();
		String result=dao.ajaxFetchAll();
		out.println(result);
	}
	
}
