package com.DAOAjax;


public class TeacherDAOFactory {
	public static TeacherDAO createTeacherDAO() {
		return (new TeacherDAOImpl());
		
	}
}
