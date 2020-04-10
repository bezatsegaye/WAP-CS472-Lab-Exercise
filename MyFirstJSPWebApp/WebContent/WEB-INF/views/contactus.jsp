<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   	<link rel="stylesheet" href="/MyFirstJSPWebApp/css/style.css">
</head>
<body>
    <header>
        <nav id="nav-bar">
    
    <ul>
        <li id="title">CS472-WAP:::Lab10  </li>
        <li><a href="./index"> Home|</a> </li>
        <li>About us| </li>
        <li>Contact us| </li>
    </ul>
    <div id="form">
    <form>
        <input type="text" width="30px"/>
        <input type="submit" value="Search"/>
    </form>
</div>
</div>
</nav>
</header>
<main>
    <div id="cont">
<h1 style="color: black;">Customer Contact Form</h1>
<form action="contactusController" method = "post">
	${formfaileddata}
    <label>*Name</label></br>
    <input type="text" class="Form_input" name="name" placeholder="eg. Beza Tsegaye"/><br>
    <small title="fullname">Enter your fullname</small>
    <br>
    <label>*Gender</label>
    <br>

    <input type="radio" name="gender" value="Female"/> <label>Female</label>
    <input type="radio" name="gender" value="male"/> <label>Male</label>
    <br>
    <label>*Category</label></br>
    <select class="Form_input" name="category" id="category" >
     <option value="">....</option>
        <option value="feedback">Feedback</option>
        <option value="inquiry">Inquiry</option>
        <option value="complaint">Complaint</option>
    </select> <br>
    <label>*Message</label></br>
    <textarea style="height: 60px;" id="message" name="message" class="Form_input" rows="4" cols="50"></textarea>
<br>
    <input type="submit" name="submit" id="submit" class="Form_input" name="submit" value="submit"/>
   
</form>
  
        </div>
</main>
<div></div>
</body>
</html>