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
 * Servlet implementation class deleteCategory
 */
@WebServlet("/deleteCategory")
public class deleteCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteCategory() {
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
			System.out.println(firstParam);			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("createdelete").equals("Delete"))
			{
				System.out.println("test");
			result=proxy.deleteCategory(firstParam);
			
				if(result!=null)
				{

            request.setAttribute("msg","Category deleted succesfully");
			
			request.getRequestDispatcher("/View/createDeleteSuccess.jsp").forward(request, response);
		
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

