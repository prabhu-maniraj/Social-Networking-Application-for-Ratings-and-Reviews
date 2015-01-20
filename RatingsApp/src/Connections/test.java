package Connections;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Services test = new Services();
	
	//String result=test.signInUser("asdf@gmail.com","123456");
	//String firstname, String lastname,String emailid,String password,String logintime
	//String result=test.signUpUser("janranjani","kanagaraj","maniraj@gmail.com","123456");
	String result=test.deleteCategory("prabhu");
	//String result=test.updateCategory("prabhu","maniraj","7","hehe","pbu@gmail.com");
	
	//String result=test.signInAdmin("pbustudy@gmail.com","123456");
	System.out.println(result);
	
	}

}
