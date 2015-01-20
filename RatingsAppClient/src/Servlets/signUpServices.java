package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connections.ManagedBean;
import Connections.ServicesProxy;

/**
 * Servlet implementation class signUpServices
 */
@WebServlet("/signUpServices")
public class signUpServices extends HttpServlet {
	 ServicesProxy proxy=new ServicesProxy(); 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signUpServices() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String result;
		
		try{
			
			String firstParam=request.getParameter("firstname");
			String secondParam=request.getParameter("lastname");
			String thirdParam=request.getParameter("emailid");
			String fourthParam=request.getParameter("password");
			System.out.println("one");
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("signup").equals("SignUp"))
			{
				
			result=proxy.signUpUser(firstParam,secondParam,thirdParam,fourthParam);
				if(result!=null)
				{
					HttpSession session = request.getSession();	
		session.setAttribute("firstname",firstParam);
		session.setAttribute("loginid",thirdParam);
			session.setAttribute("lastname",secondParam);
			Date logintime=new Date();
			session.setAttribute("logintime",logintime);

			
			request.getRequestDispatcher("/View/SuccessLogin.jsp").forward(request, response);
			
		
			out.println("Result of addition"+result);
				}
				else
				{
					System.out.println("Calculation is not performed");
				}
			}
		}
		 catch (Exception e)
        {
		 System.out.println("err2");
            e.printStackTrace();
        }
		// TODO Auto-generated method stub

	}

}
