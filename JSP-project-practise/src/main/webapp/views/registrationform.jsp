<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Registration Form</h2>
	<form action="userRegister">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstname"
					placeholder="Enter Here" /></td>

			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastname" placeholder="Enter Here" /></td>

			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" placeholder="Enter Here" /></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder="Enter Here" /></td>

			</tr>

			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male" />Male<input
					type="radio" name="gender" value="female" />Female</td>

			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number" name="age" placeholder="Enter Here" /></td>

			</tr>
			<tr>
				<td>Course</td>
				<td><form:select path="course">
						<form:options items="${courseList}" />
					</form:select>
					<select id="course" name="course">
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="NodeJS">NodeJS</option>
					<option value="PHP">PHP</option>
				</select>
					</td>

				
			</tr>
			<tr>
			 <td> <button type="submit">Submit </button> </td>
			
			 </tr>
		</table>

	</form>
</body>
</html>