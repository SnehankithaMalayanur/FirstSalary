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
  <li><a class="active"  href="viewallapplyjobs">View All Jobs</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Jobs/u></h3>

<table align=center border=2>

<tr>

<th>id</th>
<th>name</th>
<th>gender</th>
<th>skill1</th>
<th>skill2</th>
<th>emailid</th>
<th>resume</th>
<th>location</th>
<th>linkedinurl</th>
<th>contactno</th>

</tr>

<c:forEach items="${applyjoblist}" var="applyjob">

<tr>

<td> <c:out value="${applyjob.id}"></c:out>   </td>
<td> <c:out value="${applyjob.name}"></c:out>   </td>
<td> <c:out value="${applyjob.gender}"></c:out>   </td>
<td> <c:out value="${applyjob.skill1}"></c:out>   </td>
<td> <c:out value="${applyjob.skill2}"></c:out>   </td>
<td> <c:out value="${applyjob.emailid}"></c:out>   </td>
<td> <c:out value="${applyjob.resume}"></c:out>   </td>
<td> <c:out value="${applyjob.location}"></c:out>   </td>
<td> <c:out value="${applyjob.linkedinurl}"></c:out>   </td>
<td> <c:out value="${applyjob.contactno}"></c:out>   </td>
<td> 

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
