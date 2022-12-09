<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
        <header>Registration Form</header>
            <form name="form1" method="post">
                <div class="form-first" >
                    <div class="details personal" >
                        <span class="title">Details of teacher</span>
                        <div class="fields">
                            <div class="input-fields">
                                <label>First name</label>
                                <input type="text" name="fname" placeholder="Enter first name here" required>
                            </div>
                            <div class="input-fields">
                                <label>Last name</label>
                                <input type="text" name="lname" placeholder="Enter last name here" required>
                            </div>
                            <div class="input-fields">
                            <label for="Male">Male:
                         	<input type="radio" name="gender" value="Male" id="Male">
                         	<span class="male-icon"><ion-icon name="man-outline"></ion-icon></span>
                         	</label>
                         	<label for="Female">Female:
                         	<input type="radio" name="gender" value="Female" id="Female">
                         	<span class="Female-icon"><ion-icon name="woman-outline"></ion-icon></span>
                         	</label>
                            </div>
                            <div class="input-fields">
                                <label>Address</label>
                                <input type="text" name="address" placeholder="Enter address here" required>
                            </div>
                            <div class="input-fields">
                                <label>City</label>
                                <input type="text" name="city" placeholder="Enter city name here" required>
                            </div>
                            <div class="input-fields">
                                <label>Pin</label>
                                <input type="text" name="pin" placeholder="Enter pin here" required>
                            </div>
                            <div class="input-fields">
                                <label>Mobile no.</label>
                                <input type="text" name="mobileno" placeholder="Enter mobile no. here" required>
                            </div>
                            <div class="input-fields">
                                <label>Qualification</label>
                                <input type="text" name="qualification" placeholder="Enter qualification here" required>
                            </div>
                            <div class="input-fields">
                                <label>Designation</label>
                                <input type="text" name="designation" placeholder="Enter designation here" required>
                            </div>
                            <div class="input-fields">
                                <label>Specialization</label>
                                <input type="text" name="specialization" placeholder="Enter specialization here" required>
                            </div>
                            <div class="input-fields">
                                <label>Birth date</label>
                                <input type="date" name="birthdate" placeholder="yyyy-mm-dd" required>
                            </div>
                            <div class="input-fields">
                                <label>Joining date</label>
                                <input type="date" name="joiningdate" placeholder="yyyy-mm-dd" required>
                            </div>
                        </div>
                    </div>
                </div>
		<a href="#" onclick="teacherRegistration();" class="bttn">
        <span>Submit</span>
         <div class="liquid"></div>
   		 </a>
   		             </form>
	 </div>
</body>
</html>