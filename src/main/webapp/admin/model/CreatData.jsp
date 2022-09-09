<%@page import="controller.DataUserController"%>
<%@page import="model.DataUser" %>

<% 
	DataUser dataUser =  new DataUser();
	try{
	dataUser.setIdDataUser(Integer.valueOf(request.getParameter("id")));
	}catch(Exception e){
		dataUser.setIdDataUser(0);
	}
	dataUser.setFkUser(Integer.valueOf(request.getParameter("fk_user")));
	dataUser.setNmCPF(request.getParameter("cpf"));
	dataUser.setNmCreditCard(request.getParameter("nm_credit_card"));
	dataUser.setNmCod(request.getParameter("cod_card"));
	DataUserController dataUserCtl = new DataUserController();
	dataUserCtl.creat(dataUser);
	response.sendRedirect("../view/MainInterface.jsp");
	
%>