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

<h1 align=center>FirstSalary</h1>

<br>

<ul>
  <li><a class="active" href="irpadminhome">Home</a></li>
  <li><a href="viewalljobseekers">View All JobSeekers</a></li>
  <li><a href="viewallrecruiters">View All Recruiters</a></li>
  <li><a href="recruiterregistration">Register Recruiter</a></li>
  <li><a href="irpadminlogin">Logout</a></li>
</ul>

<br>
<div id="my-pie-chart" align="center"></div>
<style>
	.pie-chart {
		background:
			radial-gradient(
				circle closest-side,
				transparent 66%,
				white 0
			),
			conic-gradient(
				#4e79a7 0,
				#4e79a7 38%,
				#f28e2c 0,
				#f28e2c 61%,
				#e15759 0,
				#e15759 77%,
				#76b7b2 0,
				#76b7b2 87%,
				#59a14f 0,
				#59a14f 93%,
				#edc949 0,
				#edc949 100%
		);
		position: relative;
		width: 500px;
		min-height: 500px;
		margin: 0;
		
	}
	.pie-chart h2 {
		position: absolute;
		margin: 1rem;
	}
	.pie-chart figcaption {
		position: absolute;
		bottom: 1em;
		right: 1em;
		font-size: smaller;
		text-align: right;
	}
	.pie-chart span:after {
		display: inline-block;
		content: "";
		width: 0.8em;
		height: 0.8em;
		margin-left: 0.4em;
		height: 0.8em;
		border-radius: 0.2em;
		background: currentColor;
	}
</style>
<figure class="pie-chart">
	<h2 align="center">Applied Jobs in Different Sectors</h2>
	<figcaption>
		Developer 38<span style="color:#4e79a7"></span><br>
		Software Trainer 23<span style="color:#f28e2c"></span><br>
		Software Tester 16<span style="color:#e15759"></span><br>
		Manager 10<span style="color:#76b7b2"></span><br>
		HR 6<span style="color:#59a14f"></span><br>
		Designer 7<span style="color:#edc949"></span>
	</figcaption>
</figure>

<h3 align=right>Welcome&nbsp;<c:out value="${iauname}"></c:out></h3>

</body>
</html>

 
