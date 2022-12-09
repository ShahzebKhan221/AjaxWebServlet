<%@page import="com.DAOAjax.TeacherDAOFactory"%>
<%@page import="com.DAOAjax.TeacherDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int teacherid=Integer.parseInt(request.getParameter("teacherid"));

TeacherDAO dao=TeacherDAOFactory.createTeacherDAO();
String[]result=dao.FetchById(teacherid);
//out.println("<br><p class='heading-table'>"+result[0]+", "+result[1]+", "+result[2]+", "+result[3]+", "+result[4]+", "+result[5]+", "+result[6]+
//", "+result[7]+", "+result[8]+", "+result[9]+result[10]+", "+result[11]+", "+result[12]+", "+result[13]+"</p>");
 %>
 <div class="container">
        <header>Updation Form</header>
            <form name='formupdate' method='post' action='UpdateServlet2'>
                <div class="form-first" >
                    <div class="details personal" >
                        <span class="title">Details you want to update</span>
                        <div class="fields">
                         <p class='input-fields'>teacherid=<%=teacherid %></p>
                            <div class="input-fields">
                                <input type="hidden" name="teacherid" value="<%= result[0] %>">
                            </div>
                            <div class="input-fields">
                                <label>First name</label>
                                <input type="text" name="fname" value="<%= result[1] %>">
                            </div>
                            <div class="input-fields">
                                <label>Last name</label>
                                <input type="text" name="lname" value="<%= result[2] %>">
                            </div>
                            <div class="input-fields">
                                <label>Gender</label>
                                <input type="text" name="gender" value="<%= result[3] %>">
                            </div>
                            <div class="input-fields">
                                <label>Address</label>
                                <input type="text" name="address" value="<%= result[4] %>">
                            </div>
                            <div class="input-fields">
                                <label>City</label>
                                <input type="text" name="city" value="<%= result[5] %>">
                            </div>
                            <div class="input-fields">
                                <label>Pin</label>
                                <input type="text" name="pin" value="<%= result[6] %>">
                            </div>
                            <div class="input-fields">
                                <label>Mobile no.</label>
                                <input type="text" name="mobileno" value="<%= result[7] %>">
                            </div>
                            <div class="input-fields">
                                <label>Qualification</label>
                                <input type="text" name="qualification" value="<%= result[8] %>">
                            </div>
                            <div class="input-fields">
                                <label>Designation</label>
                                <input type="text" name="designation" value="<%= result[9] %>">
                            </div>
                            <div class="input-fields">
                                <label>Specialization</label>
                                <input type="text" name="specialization" value="<%= result[10] %>">
                            </div>
                            <div class="input-fields">
                                <label>Birth date</label>
                                <input type="date" name="birthdate" value="<%= result[11] %>">
                            </div>
                            <div class="input-fields">
                                <label>Joining date</label>
                                <input type="date" name="joiningdate" value="<%= result[12] %>">
                            </div>
                        </div>
                    </div>
                </div>
				<input type='button'  value='update record' onclick='return UpdateRecord()' />
				<a href="#" onclick="return UpdateRecord()" class="bttn">
        <span>Update</span>
         <div class="liquid"></div>
   		 </a>
            </form>
				

    </div>
 
 
</body>
</html>