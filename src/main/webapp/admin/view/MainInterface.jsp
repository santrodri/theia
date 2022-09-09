<%@page import="model.User"%>
<%@page import="controller.UserController"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Interface Principal</title>
    <style>
        body{text-align: center;}
        main{
            margin: 0 auto;
            width: 95%;
        }
        table td, table th {
            text-align: center;
            width: 150px;
            height: 10px;
            border: 1px solid gray;
            padding: 2px;
        }
    </style>
</head>
<body>
	 <table >
            <tr>
              <th>ID_USUARIO</th>
              <th>NOME_REAL</th>
              <th>NOME_USUARIO</th>
              <th>EMAIL</th>
              <th>AGE</th>
              <th>SENHA CRIPTOGRAFADA</th>
              <th>OPÇÕES</th>
             </tr>
    <%
          UserController userCtl = new UserController();
		  String linkDeEdicao  = "FormUpdateUser.jsp?id=%s";
		  String linkDeRemocao = "../controller/RespRemoveUser.jsp?id=%s";
		  String linkData = "FormUpdateData.jsp?id=%s";
		  for (Map.Entry<Integer, User> users : userCtl.selectFull().entrySet()) {
			  int key = users.getKey();
			  User user = users.getValue();
	      	String linkDeRemocaoEmUso = String.format(linkDeRemocao, user.getId());
	      	String linkDeEdicaoEmUso = String.format(linkDeEdicao, user.getId());
	     	String linkDataInUse = String.format(linkData, user.getId());
	      	%>
	            <tr>
	            	<td><%=user.getId() %></td>
	                <td><%=user.getName()%></td>
	                <td><%=user.getUserName() %></td>
	                <td><%=user.getEmail()%></td>
	                <td><%=user.getAge()%></td>
	                <td><%=user.getPassword()%></td>
	                
	                    
	            <td>
	                    <a href="<%=linkDeEdicaoEmUso %>"><input type="button" value="editar"></a>
	                    <a href="<%=linkDeRemocaoEmUso%>"><input type="button" value="remover"></a>         
	                    <a href="<%=linkDataInUse%>"><input type="button" value="Alterar dados"></a>         
	           </td>
	            </tr>
         <%
         	}
         %>
	</table>
	<a href="FormCreatUser.jsp"><input type="button" value="Criar usuario"></a>
</body>
</html>