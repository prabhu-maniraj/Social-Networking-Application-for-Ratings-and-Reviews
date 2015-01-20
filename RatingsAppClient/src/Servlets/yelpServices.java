package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connections.ServicesProxy;
import Connections.ManagedBean;

/**
 * Servlet implementation class yelpServices
 */
public class yelpServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public yelpServices() {
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
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ManagedBean result;
		HttpSession session = request.getSession();
		
		try{
			
			String firstParam=request.getParameter("loginid");
			String secondParam=request.getParameter("password");
			System.out.println("one");
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("login").equals("SignIn"))
			{
				
			result=proxy.signInUser(firstParam,secondParam);
			
			
				if(result!=null&&result.getReturnmsg().equalsIgnoreCase("True"))
				{
		
			session.setAttribute("firstname",result.getFirstname());
			session.setAttribute("lastname",result.getLastname());
			session.setAttribute("loginid",result.getEmailid());
			session.setAttribute("logintime",result.getLogintime());
			
			request.getRequestDispatcher("/View/SuccessLogin.jsp").forward(request, response);
			
		
				}
				else
				{
					request.setAttribute("msg","Password does not match with the login id! Please verify it");
					request.getRequestDispatcher("/View/index.jsp").forward(request, response);
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
