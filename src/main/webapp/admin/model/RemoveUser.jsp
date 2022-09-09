<%@page import="controller.UserController"%>
<%
	int id = Integer.valueOf(request.getParameter("id"));
	UserController userCtl = new UserController();
	userCtl.delete(id);
	response.sendRedirect("../view/MainInterface.jsp");
%>