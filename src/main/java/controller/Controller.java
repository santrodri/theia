package controller;
import java.util.ArrayList;
import util.*;

public abstract class Controller {
	Connector connector;
	public Controller(String server,
				      String database,
					  String user,
				 	  String password){
		connector = new Connector(server, database, user, password);
	}
	public Controller() {
		connector = new Connector("localhost", "db_user", "root", "20192263877");	
	}
	abstract void creat(Class<?> user);
	abstract void delete(Integer id);
	abstract public void update(Class<?> user);
	abstract public Class<?> selectUnique(Integer id);
	abstract public ArrayList<Class> selectFull();
	}

