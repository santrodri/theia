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
	<form action="../controller/RespFormCreatUser.jsp" method="post">
		<table>
			<tbody>
				<tr>
					<th>Dados</th>
					<th>valores</th>
				</tr>
				<tr>
					<td>Nome Real</td>
					<td>
						<input name="name" required>
		            </td>
				</tr>
				
				<tr>
					<td>Nome de Usuario</td>
					<td>
						<input name="user_name" required>
		            </td>
				</tr>			
	         	
	         	<tr>
					<td>Idade</td>
					<td>
						<input type="number" name = "age" required>
		            </td>
				</tr>
	          	
	          	<tr>
					<td>Email</td>
					<td>
						<input type="email" name="email" required>
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