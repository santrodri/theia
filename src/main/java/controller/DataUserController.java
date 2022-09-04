package controller;
import util.*;
import model.DataUser;

import java.util.ArrayList;
public class DataUserController{
	Connector connector;
	public DataUserController (String server,
						   String database,
						   String user,
					 	   String password) {
		connector = new Connector(server, database, user, password);
	}
	public DataUserController() {
		connector = new Connector("localhost", "db_user", "root", "20192263877");	
	}
	public void creat(DataUser user) {}
	public void delete(Integer id) {}
	public void update(DataUser user) {}
	public DataUser selectUnique(Integer id) {return null;}
	public ArrayList<DataUser> selectFull(){ return null;}
	public static void main(String[] args) {
		DataUserController userController = new DataUserController();
		
		}
	}