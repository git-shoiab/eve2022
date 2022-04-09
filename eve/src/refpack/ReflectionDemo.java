package refpack;
//https://fluvid.com/videos/detail/8EL-9T-VyoS59n6V6#.YlDqtrvXqIE.link
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) {
		PoliceStation p1=new PoliceStation();
		Politician politician=new Politician();
		Barber barber=new Barber();
		p1.arrest(politician);
	}
}
class PoliceStation{
	public void arrest(Object pol) {
		try {
		Class suspect=pol.getClass();
		Field field=suspect.getField("name");
		System.out.println(field.get(pol));
		
		Method method=suspect.getMethod("service");
		method.invoke(pol);
		
		//To know the private or non public fields - use different methods
		field=suspect.getDeclaredField("secretName");
		field.setAccessible(true);
		System.out.println(field.get(pol));
		
		method=suspect.getDeclaredMethod("secretService");
		method.setAccessible(true);
		method.invoke(pol);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Barber{
	
}
class Politician{
	public String name="Good Man";
	private String secretName="Thief";
	
	public void service() {
		System.out.println("I am for public....and...............bla bla");
	}
	
	private void secretService() {
		System.out.println("I loot people....");
	}
}