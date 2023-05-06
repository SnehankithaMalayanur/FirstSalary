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


<h1 align=center>View Recruiter</h1>

<br>

<ul>
  <li><a href="index">Home</a></li>
  <li><a class="active"  href="viewallrecruiters">View All Recruiters</a></li>
  <li><a href="irpadminlogin">Logout</a></li>
</ul>



<table align=center>

<tr><th>ID:</th>&nbsp;<td>${recruiter.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${recruiter.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${recruiter.gender}</td></tr>
<tr><th>Industry:</th>&nbsp;<td>${recruiter.industry}</td></tr>
<tr><th>Designation:</th>&nbsp;<td>${recruiter.designation}</td></tr>
<tr><th>Location:</th>&nbsp;<td>${recruiter.location}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${recruiter.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${recruiter.contactno}</td></tr>



</table>



</body>
</html>

 
