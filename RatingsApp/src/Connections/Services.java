package Connections;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Services {	
	DatabaseConnection db=new DatabaseConnection();
	
	public String signUpUser(String firstname, String lastname,String emailid,String password)
	{
		System.out.println("Inside Signup user");
		//System.out.println(username+ pwd);
		String result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.signUpUser(firstname,lastname,emailid,password);
		
		return result;//this value is returned to the calling servlet
	}	
	public ManagedBean signInUser(String username, String pwd)
	{
		System.out.println("Inside Signup");
		//System.out.println(username+ pwd);
		ManagedBean result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.signInUser(username,pwd);
		
		return result;//this value is returned to the calling servlet
	}
	
	public String createCategory(String ename,String edescription,String eratings,String ereviews,String mailid)
	{
		System.out.println("i am in create cat");
		//System.out.println(username+ pwd);
		String result;
		
	
		
		result = db.createCategory(ename,edescription,eratings,ereviews,mailid);
		
		return result;//this value is returned to the calling servlet
	}
	public String deleteCategory(String name)
	{
		System.out.println("Inside delete");
		//System.out.println(username+ pwd);
		String result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.deleteCategory(name);
		
		return result;//this value is returned to the calling servlet
	}
	public String updateCategory(String ename, String edescription,String eratings,String ereviews,String mailid)
	{
		System.out.println("Inside update");
		//System.out.println(username+ pwd);
		String result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.updateCategory(ename,edescription,eratings,ereviews,mailid);
		
		return result;//this value is returned to the calling servlet
	}
	public ManagedBean signInAdmin(String username, String pwd)
	{
		System.out.println("Inside admin signin");
		//System.out.println(username+ pwd);
		ManagedBean result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.signInAdmin(username,pwd);
		
		return result;//this value is returned to the calling servlet
	}
	public String adminCategory(String username, String pwd)
	{
		System.out.println("Inside admin signin");
		//System.out.println(username+ pwd);
		String result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		//result = db.signInAdmin(username,pwd);
		result ="true";
		
		return result;//this value is returned to the calling servlet
	}
	public String[] viewAdminCatecory()
	{
		System.out.println("Inside viewadmin category");
		//System.out.println(username+ pwd);
		String[] result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.viewAdminCatecory();
		
		return result;
		
		
	}
	
	public String viewUserReviews(String email)
	{
		System.out.println("Inside viewadmin category");
		//System.out.println(username+ pwd);
		String result;
		
		/**This space is left for validation and manipulation of 
		input values entered by the user as a part of the server side validation*/
		
		result = db.viewUserReviews(email);
		
		return result;
		
		
	}
	
}
