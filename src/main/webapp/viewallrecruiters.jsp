<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

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

<h1 align=center>FirstSalary</h1>

<br>

<ul>
  <li><a href="index">Home</a></li>
  <li><a class="active"  href="viewallrecruiterss">View All Recruiters</a></li>
  <li><a href="irpadminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Recruiters</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Industry</th>
<th>Designation</th>
<th>Location</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${recruiterlist}" var="recruiter">

<tr>

<td> <c:out value="${recruiter.id}"></c:out>   </td>
<td> <c:out value="${recruiter.name}"></c:out>   </td>
<td> <c:out value="${recruiter.gender}"></c:out>   </td>
<td> <c:out value="${recruiter.industry}"></c:out>   </td>
<td> <c:out value="${recruiter.designation}"></c:out>   </td>
<td> <c:out value="${recruiter.location}"></c:out>   </td>
<td> <c:out value="${recruiter.emailid}"></c:out>   </td>
<td> <c:out value="${recruiter.username}"></c:out>   </td>
<td> <c:out value="${recruiter.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deleterecruiter?id=${recruiter.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewrecruiterbyid?id=${recruiter.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
