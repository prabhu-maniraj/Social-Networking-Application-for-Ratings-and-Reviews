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

import Connections.ServicesProxy;

/**
 * Servlet implementation class createCat
 */
public class createCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createCat() {
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
		String result;
		
		try{
			
			System.out.println("inside create cat servelet");
			String firstParam=request.getParameter("categoryname");
			String secondParam=request.getParameter("categorydescription");
			String thirdParam=request.getParameter("categoryratings");
			String fourthParam=request.getParameter("categoryreviews");
			System.out.println(firstParam);
		/*	HttpSession session=request.getSession(true);
			response.setContentType("text/html");
			String email=(String)session.getAttribute("loginid");
			System.out.println("one");*/
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("createcat").equals("createcat"))
			{
				System.out.println("test");
			result=proxy.createCategory(firstParam,secondParam,thirdParam,fourthParam,"prabhujan@gmail.com");
			
				if(result!=null)
				{

            request.setAttribute("msg","Category created succesfully");
			
			request.getRequestDispatcher("/View/createCatSuccess.jsp").forward(request, response);
		
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


