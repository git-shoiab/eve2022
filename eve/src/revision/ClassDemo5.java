package revision;
//https://fluvid.com/videos/detail/6B-o2iQ9kwCeDpxL-#.YjkzbVjRw_0.link
public class ClassDemo5 {
public static void main(String[] args) {
	TrainingRoom gandhi=new TrainingRoom();
	
	TrainingRoom nehru=new TrainingRoom();
	
	System.out.println(gandhi.sanyo);
	System.out.println(gandhi.toilet);
	
	System.out.println(nehru.sanyo);
	System.out.println(nehru.toilet);
}
}

class TrainingRoom{
	Projector sanyo=new Projector();//instance variable
	static Toilet toilet=new Toilet();//class variable
}

class Projector{
	
}

class Toilet{
	
}