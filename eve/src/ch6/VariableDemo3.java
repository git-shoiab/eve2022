package ch6;
//https://fluvid.com/videos/detail/KR9rGt6QQgFap1Qn5#.YhbnqgGaNYo.link
public class VariableDemo3 {
	public static void main(String[] args) {
		TrainingRoom netaji=new TrainingRoom();
		
		TrainingRoom betaji=new TrainingRoom();
		
		System.out.println(netaji.sanyo+":"+betaji.sanyo);
		
		System.out.println(netaji.sulab+":"+betaji.sulab);
		System.out.println(TrainingRoom.sulab+":"+TrainingRoom.sulab);
	}
}

class TrainingRoom{
	Projector sanyo=new Projector();
	static Toilet sulab=new Toilet();
}

class Projector{
	
}

class Toilet{
	
}