package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	private Connection connection;
	private Statement statement;
	public Connector(String server,
					 String database,
				 	 String user,
			 		 String password) {
		String adress = "jdbc:mysql://" + server + "/" + database;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			setConnection(adress, user, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	private void setConnection(String adress,
							  String user,
							  String password) {
		try {
		this.connection = DriverManager.getConnection(adress,
													  user,
													  password);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro na setagem da conexao");
		}
	}

	private void setStatement() {
		try {
			this.statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erro ao criar um statment");
		}
	}
	
	public void killStatement() {
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erro ao fechar o statment");
		}
	}
	
	public void executeUpdate(String sql){
		try {
			setStatement();
			statement.execute(sql);
		}catch (Exception e) {
			System.out.println("erro ao executar o sql");
		}finally {
			killStatement();
		}
		
	}
	public ResultSet executeQuery(String sql){
		setStatement();
		ResultSet result = null;
		try {
			result = statement.executeQuery(sql);
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao executar o sql");
		}
		
		return result;
	}
	
}
