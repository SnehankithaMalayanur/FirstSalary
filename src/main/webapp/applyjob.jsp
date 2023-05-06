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
  background-color: grey;
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
color: green;
}
li a:hover {
  background-color: orange;
  color: white;
}
.card {
    width: 30%;
    display: flex;
    flex-direction: column;
    border: 1px red solid;
}
.header {
    height: 30%;
    background: red;
    color: green;
    text-align: center;
}
.container {
    padding: 2px 16px;
}
</style>

</head>

<body>

<h1 align=center>FirstSalary</h1>
	<br>

<ul>
  <li><a href="job-detail">Home</a></li>
</ul>

<br><br>

<h3 align=center><u>View Job List</u></h3>
<form method="post" action="applynow">
<table align=center border=2>

<tr>

<th>ID</th>
<th>Company</th>
<th>Job Role</th>
<th>Job Description</th>
<th>Location</th>


</tr>


<c:forEach items="${jlist}" var="j">

<tr>

<td> <c:out value="${j.id}"></c:out>   </td>
<td> <c:out value="${j.company}"></c:out>   </td>
<td> <c:out value="${j.jobrole}"></c:out>   </td>
<td> <c:out value="${j.jobdesc}"></c:out>   </td>
<td> <c:out value="${j.location}"></c:out>   </td>
<td><a href='<c:url value='applynow?id=${j.id}'></c:url>'>Apply Now</a></td>&nbsp;&nbsp;
</tr>
<tr>



</tr>

</c:forEach>

</table>
</body>
</html>