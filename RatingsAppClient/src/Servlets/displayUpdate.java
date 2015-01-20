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
 * Servlet implementation class displayUpdate
 */
@WebServlet("/displayUpdate")
public class displayUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServicesProxy proxy=new ServicesProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayUpdate() {
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
		String[] result;
		response.setContentType("text/html");
		//List<ManagedBeanAdmin> result=new ArrayList<ManagedBeanAdmin>();
		
		try{	
			HttpSession session = request.getSession();
//			String secondParam=request.getParameter("password");
			System.out.println("one");
			
			proxy.setEndpoint("http://localhost:8080/YelpFinal/services/Services");
			System.out.println("two");
			if(request.getParameter("updatecategory").equals("updatecategory"))
			{
				
			result=proxy.viewAdminCatecory();
				if(result!=null)
				{
		
					
			session.setAttribute("categoryName",result);
			
	
			
			request.getRequestDispatcher("/View/createUpdate.jsp").forward(request, response);
		
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


