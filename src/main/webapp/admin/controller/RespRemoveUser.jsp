<% 
	int id = Integer.valueOf(request.getParameter("id"));
	response.sendRedirect("../model/RemoveUser.jsp?id="+id);

%>