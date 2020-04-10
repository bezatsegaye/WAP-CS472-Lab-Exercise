<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
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
        <li> </li>
        <li> </li>
        <li> </li>
    </ul>
    <div id="form">
   
</div>
</div>
</nav>
</header>
<main>
    <div id="cont">
        <div>
            
        </div>
<h1>Thank you your message has been received as follows</h1>

        <table cellspacing="40">
         <c:forEach var="Contact" items="${ContactModel}" varStatus="iteration">
            <tr>
                <td>Name:</td> 
                <td><c:out value="${Contact.customerName}"></c:out></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><c:out value="${Contact.gender}"></c:out></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><c:out value="${Contact.category}"></c:out></td>
            </tr>
            <tr>
                <td>Message:</td>
                <td><c:out value="${Contact.message}"></c:out></td>
            </tr>
            <tr>
                <td>Please feel free to contact us:</td>
                <td></td>
            </tr>
            </c:forEach>
        </table>
        

        </div>
</main>
<footer>
</footer>
</body>
</html>