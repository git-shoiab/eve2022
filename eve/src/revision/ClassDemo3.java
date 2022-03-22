package revision;
//https://fluvid.com/videos/detail/6B-o2iQ9kwCeDpxL-#.YjkzbVjRw_0.link
public class ClassDemo3 {
	public ClassDemo3() {
		System.out.println("cons called...");
	}
	static {
		System.out.println("static block called...");
	}
	public static void main(String[] args) {
		//ClassDemo3 obj=new ClassDemo3();
		ClassDemo3.met();
		ClassDemo3.met(1);
	}
	
	static void met() {
		System.out.println("static met called...");
	}
	static void met(int i) {
		System.out.println("static met with param called...");
	}
}
