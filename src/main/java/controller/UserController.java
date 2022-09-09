package controller;
import util.*;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class UserController{
	Connector connector;
	public UserController (String server,
						   String database,
						   String user,
					 	   String password) {
		connector = new Connector(server, database, user, password);
		
	}
	
	public UserController() {
		connector = new Connector("localhost", "db_user", "root", "20192263877");	
	}
	
	public void creat(User user) {
		String sql = "INSERT INTO db_user.tb_user\n"
				+ "(ds_name, nm_age, nm_user_name, ds_email, ds_password)\n"
				+ "VALUES('%s', %s, '%s', '%s', '%s');";
		String[] data = {
				user.getName(),
				user.getAge(),
				user.getUserName(),
				user.getEmail(),
				Cryptography.encrypt(user.getPassword()) 
		};
		connector.executeUpdate(String.format(sql, data));
	}
	
	public void delete(Integer id) {
		String sql = "DELETE FROM db_user.tb_user WHERE id_user = %d";
		connector.executeUpdate(String.format(sql, id));
	}
	
	public void update(User user) {
		String sql = 
				  "UPDATE db_user.tb_user\n"
				+ "SET ds_name='%s',"
				+ "nm_age=%s,"
				+ "nm_user_name='%s',"
				+ "ds_email='%s',"
				+ "ds_password='%s'\n"
				+ "WHERE id_user=%s;\n";
		
		String[] data = {
				user.getName(),
				user.getAge(),
				user.getUserName(),
				user.getEmail(),
				Cryptography.encrypt(user.getPassword()),
				user.getId()
		};
		System.out.println(String.format(sql, data));
		connector.executeUpdate(String.format(sql, data));
	}
	
	public User selectUnique(Integer id) {
		User user = new User();
		
		String sql = "SELECT * FROM db_user.tb_user"
				   + " where id_user = %s";
		
		ResultSet result = connector.executeQuery(String.format(sql, id));
		try {
			result.next();
			user.setId(result.getInt("id_user"));
			user.setName(result.getString("ds_name"));
			user.setAge(result.getInt("nm_age"));
			user.setUserName(result.getString("nm_user_name"));
			user.setEmail(result.getString("ds_email"));
			user.setPasword(result.getString("ds_password"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {
			connector.killStatement();
		}
		return user;
	}
	
	public Map<Integer, User> selectFull() throws SQLException{
		int index = 0;
		Map<Integer, User> mapUsers = new HashMap<Integer, User>();
		ResultSet result = connector.executeQuery("SELECT * FROM db_user.tb_user");
		while (result.next()) {
			User user = new User();
			user.setId(result.getInt("id_user"));
			user.setName(result.getString("ds_name"));
			user.setAge(result.getInt("nm_age"));
			user.setUserName(result.getString("nm_user_name"));
			user.setEmail(result.getString("ds_email"));
			user.setPasword(result.getString("ds_password"));

			mapUsers.put(index++, user);
			}
			connector.killStatement();
			return mapUsers;
	}

	public int maxId() {
		String sql = "SELECT id_user FROM tb_user tu ORDER BY id_user DESC LIMIT 1";
		int maxId = 0;
		try {
			ResultSet result = connector.executeQuery(sql);
			result.next();
			maxId = result.getInt("id_user");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connector.killStatement();
		}
		return maxId;
	}
}
