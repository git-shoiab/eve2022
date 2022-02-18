package ch6;
//https://fluvid.com/videos/detail/-KRkYhG4kRsEY1D5K#.Yg8A8GyakFk.link
public class AccessDemo {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	
	void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}


class AccessDemoSamePackSubClass extends AccessDemo{
	void met() {
		//System.out.println(pri);//class scope
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class AccessDemoSamePackNonSubClass{
	void met() {
		AccessDemo obj=new AccessDemo();
		//System.out.println(obj.pri);//class scope
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}