<%@page import="util.Cryptography"%>

<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String userName = request.getParameter("user_name");
	String age = request.getParameter("age");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	password = Cryptography.encrypt(password);
	String data = "id="+id+
				  "&name="+name+
				  "&user_name="+userName+
				  "&age="+age+
				  "&email="+email+
				  "&password="+password;
	String dataUrl = "../model/UpdateUser.jsp?";
	response.sendRedirect(dataUrl+data);
	
%>