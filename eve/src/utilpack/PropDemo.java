package utilpack;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class PropDemo {
	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.put("a2", "welcome");
		prop.put("a4", "bye");
		prop.put("a1", "hello");
		prop.put("a3", "hai");
		prop.put("a5", "bye");
		
		System.out.println(prop);
		
		Enumeration en=prop.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
