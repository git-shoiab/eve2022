package utilpack;
//https://fluvid.com/videos/detail/w6e8gckkQpsm_adjZ#.Ynsg2j6Wqqg.link
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropDemo2 {
	public static void main(String[] args) throws Exception{
		Properties prop=new Properties();
		
		prop.load(new FileInputStream("abc.properties"));
		
		System.out.println(prop);
		
		Locale lo=Locale.getDefault();
		System.out.println(lo);
		Locale.setDefault(new Locale("te"));
		
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",Locale.getDefault());
		
		System.out.println(rb.getString("hello"));
		
		
	}
}	
