package revision;
//https://fluvid.com/videos/detail/6B-o2iQ9kwCeDpxL-#.YjkzbVjRw_0.link
public class ClassDemo4 {
	public static void main(String[] args) {
		Parent obj=new Child();
		obj.met();
		System.out.println(obj.age);
		System.out.println(Child.age);
	}
}
//over riding is available is only on methods not on variables...
class Parent{
	 int age=40;
	public void met() {
		System.out.println("met of parent called...");
	}
}

class Child extends Parent{
	static int age=4000;
	public void met() {
		System.out.println("met of child called...");
	}
}