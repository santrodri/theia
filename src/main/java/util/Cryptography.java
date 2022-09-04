package util; 
import org.jasypt.util.password.BasicPasswordEncryptor;

public class Cryptography {
	private static BasicPasswordEncryptor passwordEncritpor = new BasicPasswordEncryptor();
	
	public static String encryptPassword(String password) {
		String encriptedPassword = password;
		try {
			encriptedPassword = passwordEncritpor.encryptPassword(password);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao usar a criptgrafia basica nas senhas");
		}
		System.out.println(encriptedPassword);
		return encriptedPassword;
		
	}
	
	public static boolean matchPassword(String passwordPureText,String passwordEncriptedText){
		return passwordEncritpor.checkPassword(passwordPureText, passwordEncriptedText);
	}

}
