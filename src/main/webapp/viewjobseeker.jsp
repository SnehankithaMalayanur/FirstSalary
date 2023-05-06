<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>First Salary</h1>

<br>

<ul>
  <li><a href="jobseekerhome">Home</a></li>
  <li><a href="jobseekerlogin">Logout</a></li>
</ul>

<br>
     <div style="padding-top: 40px;">
<h3 align=right>Welcome&nbsp;<c:out value="${jobseekeruname}"></c:out></h3>
</div>

<br>
<div>
<table align=center>


<tr><th>ID: </th> : &nbsp;<td>${jobseeker.id}"> </td></tr>
<tr><td>Name: <td> : &nbsp;<c:out value="${jobseeker.name}"></c:out>   </td></tr>
<tr><td>Gender: <td> : &nbsp;<c:out value="${jobseeker.gender}"></c:out>   </td></tr>
<tr><td>Work Experience: <td> : &nbsp;<c:out value="${jobseeker.workexperience}"></c:out>   </td></tr>
<tr><td>Educational Qualification: <td> : &nbsp;<c:out value="${jobseeker.educationalqualification}"></c:out>   </td></tr>
<tr><td>Key Skills: <td> : &nbsp;<c:out value="${jobseeker.keyskills}"></c:out>   </td></tr>
<tr><td>Current Location: <td> : &nbsp;<c:out value="${jobseeker.currentlocation}"></c:out>   </td></tr>
<tr><td>Email Id: <td> : &nbsp;<c:out value="${jobseeker.emailid}"></c:out>   </td></tr>
<tr><td>Username: <td> : &nbsp;<c:out value="${jobseeker.username}"></c:out>   </td></tr>
<tr><td>Contact No.: <td> : &nbsp;<c:out value="${jobseeker.contactno}"></c:out>   </td></tr>



</table>

</div>

</body>
</html>

 
