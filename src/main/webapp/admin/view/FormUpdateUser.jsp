<%@page import="controller.UserController"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criação de conta</title>
 <style>
        body{text-align: center;}
        table{margin: 0 auto;}
        table td, table th {
            text-align: center;
            width: 130px;
            height: 10px;
            border: 1px solid gray;
            padding: 2px;
        }
    </style>
</head>
<body>
	<main>
	<form action="../controller/RespFormUpdateUser.jsp" method="post">
		<%
			UserController userCtl = new UserController();
			int id = Integer.valueOf(request.getParameter("id")); 
			User user = userCtl.selectUnique(id);
		%>
		<table>
			<tbody>
				<tr>
					<th>Dados</th>
					<th>valores</th>
				</tr>
				<tr hidden="true">
					<td>id</td>
					<td>
						<input name="id" value='<%=user.getId()%>' readonly="readonly" required>
		            </td>
				</tr>
				<tr>
					<td>Nome Real</td>
					<td>
						<input name="name" value='<%=user.getName()%>' required>
		            </td>
				</tr>
				
				<tr>
					<td>Nome de Usuario</td>
					<td>
						<input name="user_name" value='<%=user.getUserName()%>' required>
		            </td>
				</tr>			
	         	
	         	<tr>
					<td>Idade</td>
					<td>
						<input type="number" name = "age" value='<%=user.getAge()%>' required>
		            </td>
				</tr>
	          	
	          	<tr>
					<td>Email</td>
					<td>
						<input type="email" name="email" value='<%=user.getEmail()%>' required>
		            </td>
				</tr>
	
				<tr>
					<td>senha</td>
					<td>
						<input type="password" name="password" required>
		            </td>
				</tr>			
			</tbody>
		</table>
		
		<div>
			<input type="submit" value="enviar">
		    <input type="reset" value="retornar estado">
		</div>
		
		</form>
	</main>

</body>
</html>