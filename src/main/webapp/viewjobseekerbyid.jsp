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


<h1 align=center>View Job Seeker</h1>

<br>

<ul>
  <li><a href="index">Home</a></li>
  <li><a class="active"  href="viewalljobseekers">View All JobSeekers</a></li>
  <li><a href="irpadminlogin">Logout</a></li>
</ul>



<table align=center>

<tr><th>ID:</th>&nbsp;<td>${jobseeker.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${jobseeker.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${jobseeker.gender}</td></tr>
<tr><th>Work Experience:</th>&nbsp;<td>${jobseeker.workexperience}</td></tr>
<tr><th>Educational Qualification:</th>&nbsp;<td>${jobseeker.educationalqualification}</td></tr>
<tr><th>KeySkills:</th>&nbsp;<td>${jobseeker.keyskills}</td></tr>
<tr><th>Current Location:</th>&nbsp;<td>${jobseeker.currentlocation}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${jobseeker.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${jobseeker.contactno}</td></tr>



</table>



</body>
</html>

 
