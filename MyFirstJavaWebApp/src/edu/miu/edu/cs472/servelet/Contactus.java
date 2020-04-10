package edu.miu.edu.cs472.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelet
*/

@WebServlet("/Contactus")
public class Contactus extends HttpServlet {
	int hitCountContactUs;
	public void init() {
		hitCountContactUs = 0;
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType ("text/html");
//		response.setCharacterEncoding ("UTF-8");
//		PrintWriter	out = response.getWriter();
//		request.setAttribute("username", "John");
//		out.print((("<html><head><title>Test</title></head></body>")));
//		out.print("<span style=\"color:red;\">This is a message from the Governor of Ethiopia </span>");
//		out.print("<form action='addsecond'>");
//		out.print("<input type = 'text' name 'text'/>");
//		out.print("<input type = 'submit' value='Submit'/>");
//		out.print("</form>");
//		String val = (String)request.getAttribute("username");
//		out.print(val);
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Document</title>\r\n" + 
				"    <style>\r\n" + 
				"        #nav-bar{\r\n" + 
				"            overflow: auto;\r\n" + 
				"            background-color: gray;\r\n" + 
				"            position: relative;\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"        li{\r\n" + 
				"            display: inline;\r\n" + 
				"            font-size: 20px;\r\n" + 
				"            font-family: 'Times New Roman', Times, serif;\r\n" + 
				"        }\r\n" + 
				"        #form{\r\n" + 
				"            position:absolute;\r\n" + 
				"            top: 10px;\r\n" + 
				"            right: 10px;\r\n" + 
				"           \r\n" + 
				"        }\r\n" + 
				"        #cont {\r\n" + 
				"            width: 1000px;\r\n" + 
				"            height: 500px;\r\n" + 
				"            margin: auto;\r\n" + 
				"            /* background-color:darkgray; */\r\n" + 
				"        }\r\n" + 
				"        h1{\r\n" + 
				"            /* text-align: center; */\r\n" + 
				"            font-family: 'Times New Roman', Times, serif;\r\n" + 
				"        }\r\n" + 
				"        #title{\r\n" + 
				"            font-size: 25px;\r\n" + 
				"            font-weight:bold;\r\n" + 
				"        }\r\n" + 
				"        .Form_input{\r\n" + 
				"            width: 900px;\r\n" + 
				"            height: 30px;\r\n" + 
				"        }\r\n" + 
				"        textarea{\r\n" + 
				"            height: 400px\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <header>\r\n" + 
				"        <nav id=\"nav-bar\">\r\n" + 
				"    \r\n" + 
				"    <ul>\r\n" + 
				"        <li id=\"title\">CS472-WAP:::Lab10  </li>\r\n" + 
				"          <li><a href=\"./Home\"> Home|</a> </li>\r\n" + 
				"        <li>About us| </li>\r\n" + 
				"        <li>Contact us| </li>\r\n" + 
				"    </ul>\r\n" + 
				"    <div id=\"form\">\r\n" + 
				"    <form>\r\n" + 
				"        <input type=\"text\" width=\"30px\"/>\r\n" + 
				"        <input type=\"submit\" value=\"Search\"/>\r\n" + 
				"    </form>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</nav>\r\n" + 
				"</header>\r\n" + 
				"<main>\r\n" + 
				"    <div id=\"cont\">\r\n" + 
				"<h1>Customer Contact Form</h1>\r\n" + 
				"<form action=\"InfoProcessor\" method=\"post\">\r\n" + 
				"    <label>*Name</label></br>\r\n" + 
				"    <input type=\"text\" class=\"Form_input\" name=\"name\" placeholder=\"eg. Beza Tsegaye\"/><br>\r\n" + 
				"    <small title=\"fullname\">Enter your fullname</small>\r\n" + 
				"    <br>\r\n" + 
				"    <label>*Gender</label>\r\n" + 
				"    <br>\r\n" + 
				"\r\n" + 
				"    <input type=\"radio\" name=\"gender\" value=\"Female\"/> <label>Female</label>\r\n" + 
				"    <input type=\"radio\" name=\"gender\" value=\"male\"/> <label>Male</label>\r\n" + 
				"    <br>\r\n" + 
				"    <label>*Category</label></br>\r\n" + 
				"    <select class=\"Form_input\" name=\"category\" id=\"category\" >\r\n" + 
				"        <option value=\"feedback\">Feedback</option>\r\n" + 
				"        <option value=\"inquiry\">Inquiry</option>\r\n" + 
				"        <option value=\"complaint\">Complaint</option>\r\n" + 
				"    </select> <br>\r\n" + 
				"    <label>*Message</label></br>\r\n" + 
				"    <textarea style=\"height: 60px;\" id=\"message\" name=\"message\" class=\"Form_input\" rows=\"4\" cols=\"50\"></textarea>\r\n" + 
				"<br>\r\n" + 
				"    <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"Form_input\" name=\"submit\" value=\"submit\"/>\r\n" + 
				"    <br>\r\n" + 
				"   \r\n" + "Hit count for this page " + hitCountContactUs++ +
				"</form>\r\n" + 
				"  \r\n" + 
				"        </div>\r\n" + 
				"</main>\r\n" + 
				
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
