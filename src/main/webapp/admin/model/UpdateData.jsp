<%@page import="controller.DataUserController"%>
<%@page import="model.DataUser" %>

<% 
	DataUser dataUser = new DataUser();
	dataUser.setIdDataUser(Integer.valueOf(request.getParameter("id")));
	dataUser.setFkUser(Integer.valueOf(request.getParameter("fk_user")));
	dataUser.setNmCPF(request.getParameter("cpf"));
	dataUser.setNmCreditCard(request.getParameter("nm_credit_card"));
	dataUser.setNmCod(request.getParameter("cod_card"));
	
	DataUserController dataUserCtl = new DataUserController();
	if (dataUser.getIdDataUser().equals("0")){
		dataUserCtl.creat(dataUser);
	}else{
		dataUserCtl.update(dataUser);
	}
	response.sendRedirect("../view/MainInterface.jsp");
%>