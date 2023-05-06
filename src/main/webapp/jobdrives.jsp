<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<style>

body {
  background-image: url('loginimage.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: green;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}


ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: white;
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
  <li><a href="/">Home</a></li>
  
</ul>

<br><br>

<h3 align=center><u>Add Job Drive</u></h3>

<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>

<br>


<form:form action="insertjobdrive" method="post" modelAttribute="jobdrive">

<table align=center>

<tr>
<td><label>Company</label></td>
<td>
<form:input path="company" required="required"></form:input>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Job Role</label></td>
<td><form:input path="jobrole" required="required"/></td>

</tr>

<tr><td></td></tr>

<tr>
<td><label>Job Description</label></td>
<td><form:input path="jobdesc" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>SSC Percentage</label></td>
<td><form:input path="ssc" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Inter Percentage</label></td>
<td><form:input path="inter" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>UG Percentage</label></td>
<td><form:input path="ug" required="required"/></td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Backlogs</label></td>
<td><form:input path="backlogs" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Date Posted</label></td>
<td><form:input type="date" path="date" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Location</label></td>
<td><form:input path="location" required="required"/></td>
</tr>

<tr><td></td></tr>



<tr align=center>
<td colspan=2><input type="submit" value="Submit" class="button"></td>
</tr>

</table>

</form:form>



</body>
</html>

 