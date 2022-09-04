package controller;
import util.*;
import model.User;
import java.util.ArrayList;
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
	public void creat(User user) {}
	public void delete(Integer id) {}
	public void update(User user) {}
	public User selectUnique(Integer id) {return null;}
	public ArrayList<User> selectFull(){ return null;}
	public static void main(String[] args) {}

}
