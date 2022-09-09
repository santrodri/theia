<%@page import="controller.UserController"%>
<%@page import="model.User"%>
<% 
	User user = new User();
	user.setId(Integer.valueOf(request.getParameter("id")));
	user.setName(request.getParameter("name"));
	user.setUserName(request.getParameter("user_name"));
	user.setAge(Integer.valueOf(request.getParameter("age")));
	user.setEmail(request.getParameter("email"));
	user.setPasword(request.getParameter("password"));
	try{
		UserController userctl = new UserController();
		userctl.update(user);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		response.sendRedirect("../view/MainInterface.jsp");
	}
%>