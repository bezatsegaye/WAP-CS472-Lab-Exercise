package edu.miu.edu.cs472.servelet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelet
*/

@WebServlet("/contactusController")
public class ContactusController extends HttpServlet {
	int hitCountContactUs;
	public void init() {
		hitCountContactUs = 0;
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactusController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter out = response.getWriter();
//		out.print("");
		
		//request.setAttribute("formfaileddata", formfaileddata);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/contactus.jsp");
		rd.forward(request, response);
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String category = request.getParameter("gender");
		String feedback = request.getParameter("category");
		String message = request.getParameter("message");
		PrintWriter out = response.getWriter();
		String formfaileddata="";
		if(name=="") {
			formfaileddata = formfaileddata+"<p style=\"color: red;\">Name is Missing </p>\n";
		}
		
		if(category==null)
		{
			formfaileddata =formfaileddata+ "<p style=\"color: red;\">Category is Missing </p>\n";
		}
			if(feedback=="")
			{
				formfaileddata =formfaileddata+ "<p style=\"color: red;\">Feedback is Missing </p>\n";
				
			}
				if(message=="")
				{
					formfaileddata =formfaileddata+ "<p style=\"color: red;\">message is Missing </p>\n";
						
				}
				
				if(formfaileddata=="") {
					response.sendRedirect("ThankyouController?name=" + name +"&category="+category+"&feedback="+feedback+"&message="+message);
					
					
				}
				else
				{
				//out.print(formfaileddata);
				request.setAttribute("formfaileddata", formfaileddata);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/contactus.jsp");
				rd.forward(request, response);
				}
				
				
	}

}
