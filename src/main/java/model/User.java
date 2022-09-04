/**
 * 
 */
package model;

/**
 * @author rodrigo
 *
 */
public class User {

	private int id;
	private int idUserData; 
	private String name;
	private String age;
	private String userName;
	private String email;
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public int getIdUserData() {
		return idUserData;
	}

	public void setIdUserData(int idUserData) {
		this.idUserData = idUserData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPasword(String password) {
		this.password = password;
	}
	
}
