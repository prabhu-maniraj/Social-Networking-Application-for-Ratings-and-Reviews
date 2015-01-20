package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connections.ServicesProxy;

/**
 * Servlet implementation class createUpdate
 */
@WebServlet("/createUpdate")
public class createUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createUpdate() {
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
			
			System.out.println("inside create cat servelet");
			String firstParam=request.getParameter("categoryname");
			String secondParam=request.getParameter("categorydescription");
			String thirdParam=request.getParameter("categoryratings");
			String fourthParam=request.getParameter("categoryreviews");
			System.out.println(firstParam);
		HttpSession session=request.getSession(true);
			response.setContentType("text/html");
			String email=(String)session.getAttribute("loginid");
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("createupdate").equals("Update"))
			{
				System.out.println("test");
			result=proxy.updateCategory(firstParam,secondParam,thirdParam,fourthParam,email);
			
				if(result!=null)
				{

            request.setAttribute("msg","Category Updated succesfully");
			
			request.getRequestDispatcher("/View/createUpdateSuccess.jsp").forward(request, response);
		
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

