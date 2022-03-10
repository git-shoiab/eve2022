package ch6;
//https://fluvid.com/videos/detail/v_v8rS1_qBt4g9Qax#.Yia-29JH65I.link
public class InterfaceDemo {

}
//role
interface Doctor{//action noun
	public void doCure();
}
interface Nurse{
	public void doCare();
}
//actor
class Human{
	
}
//implementation class
class AlopathyMedicalCollege implements Doctor,Nurse{
	@Override
	public void doCure() {
		System.out.println("i will cure people with chemicals....");
	}
	@Override
	public void doCare() {
		System.out.println("alopathu care...");
	}
}

class UnaniMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("I will learn herbal but will practice chemical...");
	}
}
