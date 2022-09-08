<%@page import="util.Cryptography"%>
<%@page import="model.User"%>
<%
	String name = request.getParameter("name");
	String userName = request.getParameter("user_name");
	String age = request.getParameter("age");
	String email = request.getParameter("email");
	
	String password = request.getParameter("password");
	password = Cryptography.encrypt(password);
	String data = "name="+name+
				  "&user_name="+userName+
				  "&age="+age+
				  "&email="+email+
				  "&password="+password;
	String dataUrl = "../model/CreateUser.jsp?";
	response.sendRedirect(dataUrl+data);
	
%>