package ch6;
//https://fluvid.com/videos/detail/P5OY2TPMV1UgrgqQy#.Yh7VnHdwsDA.link
public class AbstractDemo11 {
	public static void main(String[] args) {
		Hall hall;
		//hall=new Hall();// cannot instantiate abstract class
		Hall.metS();
		hall=new PartyHall();
		hall.met();
		if(hall instanceof PartyHall) {
			System.out.println("yes this is party hall now....");
		}
		hall=new MeetingHall();
		hall=new PartyHall();
		
		if(hall instanceof MeetingHall) {
			System.out.println("yes this is meeting hall now....");
		}
		else {
			System.out.println("no this is not a meeting hall...");
		}
		accept(hall);
		accept(new MeetingHall());
		
	}
	
	static void accept(Hall hall) {
		System.out.println("party................:"+hall);
	}
	
	static void accept(MeetingHall hall) {
		System.out.println("meeting................:"+hall);
	}
}


abstract class Hall{
	public Hall() {
		System.out.println("cons of abs called...");
	}
	static {
		System.out.println("static block of abs called...");
	}
	public void met() {
		System.out.println("abtract class met ....");
	}
	public static void metS() {
		System.out.println("static met of abs called...");
	}
}

class PartyHall extends Hall{//party hall is a kind of hall
	public PartyHall() {
		System.out.println("party hall cons called....");
	}
}

class MeetingHall extends Hall{//party hall is a kind of hall
	public MeetingHall() {
		System.out.println("party hall cons called....");
	}
}