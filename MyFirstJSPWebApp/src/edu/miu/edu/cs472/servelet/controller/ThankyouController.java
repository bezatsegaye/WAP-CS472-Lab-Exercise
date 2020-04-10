package edu.miu.edu.cs472.servelet.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.edu.cs472.servelet.model.ContactModel;

/**
 * Servlet implementation class ThankyouController
 */
@WebServlet("/ThankyouController")
public class ThankyouController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThankyouController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 List<ContactModel> con = Arrays.asList(new ContactModel(request.getParameter("name"),request.getParameter("category"),request.getParameter("feedback"),request.getParameter("message")));
	         
		
		request.setAttribute("ContactModel", con);
//		request.setAttribute("category", con.getGender());
//		request.setAttribute("feedback", con.getCategory());
//		request.setAttribute("message", con.getMessage());
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/thankyou.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
