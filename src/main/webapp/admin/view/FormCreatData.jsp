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
    <%
    	String id_user = request.getParameter("id");
    %>
</head>
<body>
	<main>
	<form action="../controller/RespFormCreatData.jsp" method="post">
		<table>
			<tbody>
				<tr>
					<th>Dados</th>
					<th>valores</th>
				</tr>
				
				<tr hidden="true">
					<td>
						<input name="id_user" value= <%=id_user%> required>
		            </td>
				</tr>
				
				<tr>
					<td>CPF</td>
					<td>
						<input name="cpf" required>
		            </td>
				</tr>
				
				<tr>
					<td>Numero Do Cartão De Credito</td>
					<td>
						<input name="nm_credit_card" required>
		            </td>
				</tr>
				
				<tr>
					<td>Codigo De Compra</td>
					<td>
						<input name="nm_cod_card" required>
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