package com.DAOAjax;

import java.sql.*;
import java.util.*;

public class TeacherDAOImpl implements TeacherDAO {

	String driver="com.mysql.cj.jdbc.Driver";
	String dburl="jdbc:mysql://localhost:3306/mydb";
	String username="root";
	String password="";
	private Connection con=null;
	void createConnection() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(dburl, username, password);
			System.out.println("Connection established!!!!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	@Override
	public String fetchDelete() {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			String query="select * from teacher "
					+ " where "
					+ " currentstatus='Close' ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			result="<table border='1'align='center'>";
			while(rs.next()==true) {
				result="<table align='center'>";
				result+="<thead class'heading-table'>Deleted Records</thead>";
				while(rs.next()==true) {
					result+="<tr>";
					 int teacherid=rs.getInt(1);
					 String fname=rs.getString(2);
					 String lname=rs.getString(3);
					 String gender=rs.getString(4);
					 String address=rs.getString(5);
					 String city=rs.getString(6);
					 String pin=rs.getString(7);
					 String mobileno=rs.getString(8);
					 String qualification=rs.getString(9);
					 String designation=rs.getString(10);
					 String specialization=rs.getString(11);
					 String birthdate=rs.getString(12);
					 String joiningdate=rs.getString(13);
					 String currentstatus=rs.getString(14);
					 result+="<td>"+teacherid+"<td/> "
					 		+ "<td>"+fname+"<td/> "
					 		+ "<td>"+lname+"<td/> "
					 		+ "<td>"+gender+"<td/> "
					 		+ "<td>"+address+"<td/> "
					 		+ "<td>"+city+"<td/> "
					 		+ "<td>"+pin+"<td/> "
					 		+ "<td>"+mobileno+"<td/> "
					 		+ "<td>"+qualification+"<td/> "
					 		+ "<td>"+designation+"<td/> "
					 		+ "<td>"+specialization+"<td/> "
					 		+ "<td>"+birthdate+"<td/> "
					 		+ "<td>"+joiningdate+"<td/> "
					 		+ "<td>"+currentstatus+"<td/> "
					 		+"<td><a href='#' onclick='return Rejoin("+teacherid+");' class='bttn'>Rejoin</a></td>";
					 result+="</tr>";
					}
				result+="</table>";
			
			}
			rs.close();
			con.close();
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;	
	}
	@Override
	public String ajaxFetchAll() {
		// TODO Auto-generated method 
		String res="";
		try {
			createConnection();
			Statement stmt=con.createStatement();
			String query="select * from teacher "
					+ " where "
					+ " currentstatus='Active' ";
			ResultSet rs=stmt.executeQuery(query);
			res="<table align='center'>";
			while(rs.next()==true) {
				res+="<tr>";
				 int teacherid=rs.getInt(1);
				 String fname=rs.getString(2);
				 String lname=rs.getString(3);
				 String gender=rs.getString(4);
				 String address=rs.getString(5);
				 String city=rs.getString(6);
				 String pin=rs.getString(7);
				 String mobileno=rs.getString(8);
				 String qualification=rs.getString(9);
				 String designation=rs.getString(10);
				 String specialization=rs.getString(11);
				 String birthdate=rs.getString(12);
				 String joiningdate=rs.getString(13);
				 String currentstatus=rs.getString(14);
				 res+="<td>"+teacherid+"<td/> "
				 		+ "<td>"+fname+"<td/> "
				 		+ "<td>"+lname+"<td/> "
				 		+ "<td>"+gender+"<td/> "
				 		+ "<td>"+address+"<td/> "
				 		+ "<td>"+city+"<td/> "
				 		+ "<td>"+pin+"<td/> "
				 		+ "<td>"+mobileno+"<td/> "
				 		+ "<td>"+qualification+"<td/> "
				 		+ "<td>"+designation+"<td/> "
				 		+ "<td>"+specialization+"<td/> "
				 		+ "<td>"+birthdate+"<td/> "
				 		+ "<td>"+joiningdate+"<td/> "
				 		+ "<td>"+currentstatus+"<td/> "
				 		+"<td><a href='#' onclick='return deleteteach("+teacherid+");'>Delete</a></td>"
				 		+"<td><a href='#' onclick='return functionUpdate("+teacherid+")'>Update</a></td>";
				 res+="</tr>";
				}
			res+="</table>";
		}
		catch(Exception e) {
			res=e.toString();
		}
		return res;
	}
	@Override
	public String Insert(Teacher teacher) {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			String query="insert into teacher(fname, lname, gender, address, city, pin, mobileno, qualification,"
					+ " designation, specialization, birthdate, joiningdate, currentstatus) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, teacher.getFname());
			ps.setString(2, teacher.getLname());
			ps.setString(3, teacher.getGender());
			ps.setString(4, teacher.getAddress());
			ps.setString(5, teacher.getCity());
			ps.setString(6, teacher.getPin());
			ps.setString(7, teacher.getMobileno());
			ps.setString(8, teacher.getQualification());
			ps.setString(9, teacher.getDesignation());
			ps.setString(10, teacher.getSpecialization());
			ps.setString(11, teacher.getBirthdate());
			ps.setString(12, teacher.getJoiningdate());
			ps.setString(13, "Active");
			int res=ps.executeUpdate();
			result="<p class='heading-table' ><i><b>"+res+" record/s successfully inserted in teacher table</b></i></p>";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}
	@Override
	public String update(Teacher teacher) {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			String query="update teacher set "
					+ "fname=?, "
					+ "lname=?, "
					+ "gender=?, "
					+ "address=?, "
					+ "city=?, "
					+ "pin=?, "
					+ "mobileno=?, "
					+ "qualification=?, "
					+ "designation=?, "
					+ "specialization=?, "
					+ "birthdate=?, "
					+ "joiningdate=?,"
					+ "currentstatus=? "
					+ "where "
					+ "teacherid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, teacher.getFname());
			ps.setString(2, teacher.getLname());
			ps.setString(3, teacher.getGender());
			ps.setString(4, teacher.getAddress());
			ps.setString(5, teacher.getCity());
			ps.setString(6, teacher.getPin());
			ps.setString(7, teacher.getMobileno());
			ps.setString(8, teacher.getQualification());
			ps.setString(9, teacher.getDesignation());
			ps.setString(10, teacher.getSpecialization());
			ps.setString(11, teacher.getBirthdate());
			ps.setString(12, teacher.getJoiningdate());
			ps.setString(13, "Active");
			ps.setInt(14, teacher.getTeacherid());
			int res=ps.executeUpdate();
			result="<p class='heading-table' ><i><b>"+res+" record/s successfully updated in teacher table</b></i></p>";
			ps.close();
			con.close();
			
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	
	}
	@Override
	public String[] FetchById(int teacherid) {
		// TODO Auto-generated method stub
		String[]res=new String[14];
		try {
			createConnection();
			String query="select * from teacher "
					+ "where teacherid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, teacherid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true) {
				res[0]=rs.getString(1);
				res[1]=rs.getString(2);
				res[2]=rs.getString(3);
				res[3]=rs.getString(4);
				res[4]=rs.getString(5);
				res[5]=rs.getString(6);
				res[6]=rs.getString(7);
				res[7]=rs.getString(8);
				res[8]=rs.getString(9);
				res[9]=rs.getString(10);
				res[10]=rs.getString(11);
				res[11]=rs.getString(12);
				res[12]=rs.getString(13);
				res[13]=rs.getString(14);
				
			}
			ps.close();
			rs.close();
			con.close();
		}
		catch(Exception e) {
			res[0]=e.toString();
		}
		
		return res;
	}
	@Override
	public String delete(int teacherid) {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			
			String query="update teacher set "+
					" currentstatus='Close' "+
								" where teacherid=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, teacherid);
			int res=ps.executeUpdate();
			result="<p class='heading-table' ><i><b>"+res+"</b></i> record/s sucessfully deleted from teacher table</p>";
			
			ps.close();
			con.close();
			
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}
	@Override
	public String rejoin(int teacherid) {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			
			String query="update teacher set "+
					" currentstatus='Active' "+
								" where teacherid=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, teacherid);
			int res=ps.executeUpdate();
			result="<p class='heading-table' ><i><b>"+res+"</b></i> record/s sucessfully restored in teacher table</p>";
			
			ps.close();
			con.close();
			
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	
	}


}
