package ch6;
//https://fluvid.com/videos/detail/n8QdniK949CXBkRYx#.Yh2Fhq1Ggmg.link
public class StaticDemo3 {
	public static void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
		obj.met();
		
		Outer.InnerNS objNS=new Outer().new InnerNS();
		obj.met();
	}
}

class Outer{
	static int i=100;
	static void metS() {
		System.out.println("met SSSSS called...");
		//met();
	}
	void nonStatMet() {
		
	}
	int ii=100;
	static class Inner{
		//this.ii=200;
		int n=100;
		
		public void met() {
			System.out.println("met of static inner called...."+i);
			metS();
			//nonStatMet();
			System.out.println(this.n);
		}
	}
	
	class InnerNS{
		public void met() {
			System.out.println("non stat met called...");
		}
	}
}