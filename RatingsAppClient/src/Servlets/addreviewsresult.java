package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connections.ManagedBean;
import Connections.ServicesProxy;

/**
 * Servlet implementation class addreviewsresult
 */
@WebServlet("/addreviewsresult")
public class addreviewsresult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy(); 
     
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addreviewsresult() {
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
		response.setContentType("text/html");
		String result;
		
		try{
			
			HttpSession session=request.getSession(true);
			response.setContentType("text/html");
			String email=(String)session.getAttribute("loginid");
			String categoryname=request.getParameter("categoryname");
			String description=request.getParameter("categorydescription");
			String ratings=request.getParameter("categoryratings");
			String reviews=request.getParameter("categoryreviews");
			System.out.println("one");
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("addreviews").equals("addreviews"))
			{
				
			result=proxy.createCategory(email,categoryname,description,ratings,reviews);
				if(result!=null)
				{
				
			request.setAttribute("msg","Reviews created successfully");
			request.getRequestDispatcher("/View/UserAddReviewsSuccess.jsp").forward(request, response);
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
		
	}

}
