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
	private String name;
	private Integer age;
	private String userName;
	private String email;
	private String password;
	
	public String getId() {
		return Integer.toString(id);
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getIdUserData() {
		return Integer.toString(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return Integer.toString(age);
	}

	public void setAge(Integer age) {
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
	
	public void printStatus(){
		System.out.println("\nnome: " + this.getName() +
						   "\nnome de usuario: " + this.getUserName()+
						   "\nidade: " + this.getAge() + 
						   "\nemail: " + this.getEmail() + 
						   "\nsenha: " + this.getPassword() +
						   "\nid:" + this.getId()
				);
	}
	
}
