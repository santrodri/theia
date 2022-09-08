package util; 
import org.jasypt.util.password.BasicPasswordEncryptor;

public class Cryptography {
	private static BasicPasswordEncryptor passwordEncritpor = new BasicPasswordEncryptor();
	
	public static String encrypt(String value) {
		String encriptedValue = value;
		try {
			encriptedValue = passwordEncritpor.encryptPassword(value);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao usar a criptgrafia basica ");
		}
		return encriptedValue;
		
	}
	
	public static boolean matchVaues(String valuePureText,String valueEncriptedText){
		return passwordEncritpor.checkPassword(valuePureText, valueEncriptedText);
	}

}
