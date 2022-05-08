package utilpack;
//https://fluvid.com/videos/detail/G6x-YcgD76hxZeZ-7#.Yncon6_1Q8w.link
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ColDemo3 {
	public static void main(String[] args) {
		List<Student> slist=new LinkedList<>();
		slist.add(new Student("ram"));
		slist.add(new Student("john"));
		slist.add(new Student("sham"));
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		
		Collections.sort(slist,(s1,s2)->{return s2.compareTo(s1);});
		
		System.out.println(slist);
	}
}


class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "The Name is..:"+name+"\n";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}

