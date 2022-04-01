package exceppack;
//https://fluvid.com/videos/detail/_LkeEcMn3ESm2gjQo#.YkZovMWpBbw.link
public class ExceptionDemo4 {
	public static void main(String[] args) {   //throws Exception{
		System.out.println("before...");
			new ExceptionDemo4().met(10);
		System.out.println("after....");
	}
	
	void met(int i) {     //throws Exception {
		try {
		//super.clone();
			if(i==10) {
				throw new Number10Exception();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Number10Exception extends Exception{
	
}