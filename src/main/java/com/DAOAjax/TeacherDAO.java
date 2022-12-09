package com.DAOAjax;

public interface TeacherDAO {
	String fetchDelete();
	String ajaxFetchAll();
	String Insert(Teacher teacher);
	String[]FetchById(int teacherid); 
	String update(Teacher teacher);
	String delete(int teacherid);
	String rejoin(int teacherid);
}
