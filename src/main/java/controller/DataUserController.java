package controller;
import util.*;
import model.DataUser;

import java.sql.ResultSet;

public class DataUserController{
	Connector connector;
	public DataUserController (String server,
							   String database,
						       String user,
					 	       String password) {
		connector = new Connector(server,
								  database,
								  user,
								  password);
	}
	
	public DataUserController() {
		connector = new Connector("localhost",
								  "db_user",
								  "root",
								  "20192263877");	
	}
	
	public void creat(DataUser user) {
		String sql = "INSERT INTO db_user.tb_data_user\n"
				+ "(nm_cpf, nm_credit_card, nm_cod, fk_user)\n"
				+ "VALUES('%s', '%s', '%s', %s);";
		
		String [] data = {
				user.getNmCPF(),
				user.getNmCreditCard(),
				user.getNmCod(),
				user.getFkUser()
		};
		connector.executeUpdate(String.format(sql, data));
	}
	
	public void delete(Integer id) {
		String sql = "DELETE FROM db_user.tb_data_user\n"
				   + "where fk_user = %s";
		connector.executeUpdate(String.format(sql, id));
		
	}
	
	public void update(DataUser user) {
		String sql = "UPDATE db_user.tb_data_user\n"
				+ "SET nm_cpf='%s',"
				+ "nm_credit_card='%s',"
				+ "nm_cod='%s',"
				+ "fk_user=%s\n"
				+ "where id_data_user = %s";
		
		String [] data = {
				user.getNmCPF(),
				user.getNmCreditCard(),
				user.getNmCod(),
				user.getFkUser(),
				user.getIdDataUser()
		};
		System.out.println(String.format(sql, data));
		connector.executeUpdate(String.format(sql, data));
	}
	
	public DataUser selectUnique(Integer id) {
		DataUser dataUser = new DataUser();
		String sql = "SELECT * FROM db_user.tb_data_user\n"
				   + "where fk_user = %s";
		ResultSet result = connector.executeQuery(String.format(sql, id));      
	    try {
	    	result.next();
			dataUser.setIdDataUser(result.getInt("id_data_user"));
			dataUser.setNmCPF(result.getString("nm_cpf"));
			dataUser.setNmCreditCard(result.getString("nm_credit_card"));
			dataUser.setNmCod(result.getString("nm_cod"));
			dataUser.setFkUser(result.getInt("fk_user"));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connector.killStatement();
		}
	    return dataUser;
	}

}