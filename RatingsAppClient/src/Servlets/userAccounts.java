package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.axis.encoding.ser.ArraySerializerFactory;

import Connections.ServicesProxy;

/**
 * Servlet implementation class userAccounts
 */
public class userAccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 ServicesProxy proxy=new ServicesProxy(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userAccounts() {
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
		String result;
		response.setContentType("text/html");
		
		try{	
			HttpSession session=request.getSession(true);
			response.setContentType("text/html");
			String email=(String)session.getAttribute("loginid");
			System.out.println("one");
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("accounts").equals("accounts"))
			{
				
			result=proxy.viewUserReviews(email);
			System.out.println("success transfer");
				if(result!=null)
				{
		
					
			session.setAttribute("userAccounts",result);
			
	
			
			request.getRequestDispatcher("/View/AccountsSuccess.jsp").forward(request, response);
		
				}
				else
				{
					System.out.println("Calculation is not performed");
				}
			}
		}
		 catch (Exception e)
        {
		 System.out.println("whats is happening");
            e.printStackTrace();
        }
		
		
	}

}
