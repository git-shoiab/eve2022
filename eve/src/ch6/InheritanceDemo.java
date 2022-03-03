package ch6;
//https://fluvid.com/videos/detail/_LkeEcMZp3fm23n2X#.YiAp-rdCcVo.link
public class InheritanceDemo {
	public static void main(String[] args) {
		
		Hall hall=new MeetingHall();
		
		hall=new PartyHall();
		System.out.println(hall.i);
		hall.met();
		
		PartyHall phall=new PartyHall("aaa");
		System.out.println(phall.i);
		phall.met();
		//hall=new Hall();
		//Paint paint=new Paint();
	}
}

abstract class Hall{
	int i=100;
	public Hall() {
		System.out.println("hall cons called...");
	}
	public Hall(String s) {
		System.out.println("hall overloaded cons called...");
	}
	private void supportMethodForMet() {
		
	}
	final public void met() {
		supportMethodForMet();
		System.out.println("parent met called...");
	}
}

class PartyHall extends Hall{
	public PartyHall() {
		System.out.println("party hall cons called....");
		//this.i=2000; //final variable are constants - their values cannot be changed..
	}
	public PartyHall(String s) {
		super(s);//Rule - this line should be first line in the constructor
		System.out.println("party hall cons called....:"+s);
		//super(s);
	}
	final int i=200;//this will not override the parent variable
//	public void met() {
//		System.out.println("child met called...");
//	}
}

class MeetingHall extends Hall{
	
}

final class Paint{}//final classes cannot be inherited
class RedPaint extends Paint{}