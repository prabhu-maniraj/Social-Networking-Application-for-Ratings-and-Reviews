<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel='stylesheet' href='./style.css' />
<title>Insert title here</title>
</head>
<body>

<form id="form1" action="" method="post">
<div id="head">
<h1 style="color: white; margin: 30px">Yelp Clone</h1>

<input type="submit" style="position:relative; left:1100px; width:100px; height:30px; bottom: 30px" value="Sign Out" formaction="logout">

</div>
<br><button type="button" onclick="goBack()">Go Back</button>
<h2>My Reviews</h2>
 <%
 String results=(String)session.getAttribute("userAccounts");
 String temp[];
 String deli="-";
 temp=results.split(deli);
 for(int i =0; i < temp.length ; i++)
 {
out.println("<BR>"); 
 out.println(temp[i]);
 out.println("<BR>");

 }
 
 %>


   
<br>


</form>
<form id="form2" action="" method="get">

<div>


</div>
</form>
<script type="text/javascript" >

function goBack() {
	document.location.href="SuccessLogin.jsp";
}

</script>
</body>
</html>