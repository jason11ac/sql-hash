import java.security.MessageDigest;
import java.security.*;
import java.io.*;

public class ComputeSHA {

	public static void main(String[] args) throws Exception {
		
	String fileName = args[0];
	File my_file = new File(fileName);	

	byte[] bytes = new byte[(int) my_file.length()];

	MessageDigest digest = MessageDigest.getInstance("SHA1");	
	FileInputStream stream = new FileInputStream(my_file);

	stream.read(bytes);
	stream.close();
	
	byte[] output = digest.digest(bytes);
	
	String digestString = javax.xml.bind.DatatypeConverter.printHexBinary(output);

	System.out.println(digestString.toLowerCase());
	}
}
