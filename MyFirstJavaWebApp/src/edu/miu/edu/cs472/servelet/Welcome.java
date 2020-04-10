package edu.miu.edu.cs472.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String feedback = request.getParameter("feedback");
		String message = request.getParameter("message");
		
	
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
			"           \r\n" + 
			"           \r\n" + 
			"        }\r\n" + 
			"        h1{\r\n" + 
			"            text-align: center;\r\n" + 
			"            font-family: 'Times New Roman', Times, serif;\r\n" + 
			"            border: 1px solid gray;\r\n" + 
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
			"        <li> </li>\r\n" + 
			"        <li> </li>\r\n" + 
			"        <li> </li>\r\n" + 
			"    </ul>\r\n" + 
			"    <div id=\"form\">\r\n" + 
			"   \r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</nav>\r\n" + 
			"</header>\r\n" + 
			"<main>\r\n" + 
			"    <div id=\"cont\">\r\n" + 
			"        <div>\r\n" + 
			"            \r\n" + 
			"        </div>\r\n" + 
			"<h1>Thank you your message has been received as follows</h1>\r\n" + 
			"        <table cellspacing=\"40\">\r\n" + 
			"            <tr>\r\n" + 
			"                <td>Name:</td>\r\n" + 
			"                <td>"+ name +"</td>\r\n" + 
			"            </tr>\r\n" + 
			"            <tr>\r\n" + 
			"                <td>Gender:</td>\r\n" + 
			"                <td>"+ category +"</td>\r\n" + 
			"            </tr>\r\n" + 
			"            <tr>\r\n" + 
			"                <td>Category:</td>\r\n" + 
			"                <td>"+feedback+"</td>\r\n" + 
			"            </tr>\r\n" + 
			"            <tr>\r\n" + 
			"                <td>Message:</td>\r\n" + 
			"                <td>"+message+"</td>\r\n" + 
			"            </tr>\r\n" + 
			"            <tr>\r\n" + 
			"                <td>Please feel free to contact us:</td>\r\n" + 
			"                <td></td>\r\n" + 
			"            </tr>\r\n" + 
			"        </table>\r\n" + 
			"        </div>\r\n" + 
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
