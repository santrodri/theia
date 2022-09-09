<%@page import="model.DataUser" %>

<% 
	String id = request.getParameter("id");
	String fkUser = request.getParameter("fk_user");
	String cpf = request.getParameter("cpf");
	String nmCredtCard = request.getParameter("nm_credit_card");
	String cod_card = request.getParameter("cod_card");
	String data = "id="+id+
				  "&fk_user="+fkUser+
				  "&cpf="+cpf+
				  "&nm_credit_card="+nmCredtCard+
				  "&cod_card="+cod_card;
	String dataUrl = "../model/UpdateData.jsp?";
	response.sendRedirect(dataUrl+data);
%>