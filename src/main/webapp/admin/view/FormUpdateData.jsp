<%@page import="controller.DataUserController"%>
<%@page import="model.DataUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mudança De Dados</title>
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
	<form action="../controller/RespFormUpdateData.jsp" method="post">
		<%
			DataUserController dataUserCtl = new DataUserController();
			int id = Integer.valueOf(request.getParameter("id")); 
			DataUser dataUser = dataUserCtl.selectUnique(id);
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
						<input name="id" value='<%=dataUser.getIdDataUser()%>' readonly="readonly" required>
		            </td>
				</tr>
				
				<tr hidden="true">
					<td>id</td>
					<td>
						<input name="fk_user" value='<%=id%>' readonly="readonly" required>
		            </td>
				</tr>
	
				<tr>
					<td>CPF</td>
					<td>
						<input name="cpf" value='<%=dataUser.getNmCPF()%>' required>
		            </td>
				</tr>
				
				<tr>
					<td>Numero Do Cartão</td>
					<td>
						<input name="nm_credit_card" value='<%=dataUser.getNmCreditCard()%>' required>
					</td>
				</tr>
				
				<tr>
					<td>Codigo Do Cartão</td>
					<td>
						<input name="cod_card" value='<%=dataUser.getNmCod()%>' required>
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