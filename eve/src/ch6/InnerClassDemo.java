package ch6;
//https://fluvid.com/videos/detail/BMm-riA94pUzZMYkg#.Yh2G9vZ70mQ.link
public class InnerClassDemo {
 public static void main(String[] args) {
	InnerClassDemo obj=new InnerClassDemo();
	obj.met();
}
 
 static void met() {
	 class LocalInner{
		 void met() {
			 System.out.println("local inner met called....");
		 }
	 }
	 new LocalInner().met();
	 
	 static class LocallSInner{
		 
	 }
 }
}
