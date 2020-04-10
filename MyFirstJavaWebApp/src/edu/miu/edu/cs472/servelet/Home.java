package edu.miu.edu.cs472.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServeletsecond
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	int hitCounterHome;
	public void init() {
		hitCounterHome=0;
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType ("text/html");
//		response.setCharacterEncoding ("UTF-8");
//		PrintWriter	out = response.getWriter();
//		out.print((("<html><head><title>Test</title></head></body>")));
//		out.print("<span style=\"color:green;\">Hello My seciond Servelet </span>");
//		
//		String val = request.getParameter("text");
//		out.print("The text is " + val);
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
				"            height: 200px;\r\n" + 
				"            margin: auto;\r\n" + 
				
				"        }\r\n" + 
				"        h1{\r\n" + 
				"            text-align: center;\r\n" + 
				"            font-family: 'Times New Roman', Times, serif;\r\n" + 
				"        }\r\n" + 
				"        #title{\r\n" + 
				"            font-size: 25px;\r\n" + 
				"            font-weight:bold;\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <header>\r\n" + 
				"        <nav id=\"nav-bar\">\r\n" + 
				"    \r\n" + 
				"    <ul>\r\n" + 
				"        <li id=\"title\">CS472-WAP:::Lab10  </li>\r\n" + 
				"        <li>Home| </li>\r\n" + 
				"        <li>About us| </li>\r\n" + 
				"        <li><a href=\"./Contactus\"> Contact us| </a></li>\r\n" + 
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
				"<h1>Welcome</h1>\r\n" + 
				"  <p>A Java servlet is a Java software component that extends the capabilities of a server. \r\n" + 
				"      Although servlets can respond to many types of requests, \r\n" + 
				"      they most commonly implement web containers for hosting web applications on web servers and\r\n" + 
				"       thus qualify as a server-side servlet web API. Such web servlets are the Java counterpart to\r\n" + 
				"        other dynamic web content technologies such as PHP and ASP.NET.</p>  \r\n" + 
				"        </div>\r\n" + 
				"   \r\n" + "Hit count for this page " + hitCounterHome++ +
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</main>\r\n" + 
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
