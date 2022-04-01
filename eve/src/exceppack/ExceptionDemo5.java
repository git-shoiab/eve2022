package exceppack;
//https://fluvid.com/videos/detail/_LkeEcMn3ESm2gjQo#.YkZovMWpBbw.link
public class ExceptionDemo5 {
	public static void main(String[] args) {   //throws Exception{
		System.out.println("before...");
			Dog tiger=new Dog();
			Child baby=new Child();
			
			baby.playWithDog(tiger,"stick");
			
		System.out.println("after....");
	}
	
	
}
class Child{
	public void playWithDog(Dog dog,String item) {
		try {
			dog.play(item);
		}catch(DogBiteException e) {
			System.out.println(e);
		}
	}
}
class Dog{
	public void play(String item) throws DogBiteException{
		if(item.equals("stick")) {
			throw new DogBiteException("You beat I bite.................");
		}
	}
}
class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}