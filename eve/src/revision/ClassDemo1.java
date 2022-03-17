package revision;
/*
 * 1. class
 * 2. object
 * 3. variables
 * 3. methods
 * 4. constructors
 * 5. inheritance
 * 6. abstract
 * 7. interface
 * 8. exception
 * 9. wrapper classes and String 
 */
//https://fluvid.com/videos/detail/BMm-riARKyfzZ9EAa#.YjKh8DBYHio.link
public class ClassDemo1 {
	int i=10;//simple primitive types
	String name="eve";
	int arr[]=new int[5];
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		System.out.println(obj.i);
		System.out.println(obj.name);
		System.out.println(obj.arr[1]);
		Employee emp=new Employee("heavy");//complex type
		emp.eno=100;
		emp.ename="basha";
		emp.esal=9000;
		obj.print(emp);
	}
	void print(Employee emp) {
		System.out.println(emp.eno+":"+emp.ename+":"+emp.esal+":"+emp.weight);
	}
}

class Employee{
	String prop;
	int weight;
	public Employee(String prop) {
		this.prop=prop;
		this.weight=getWeight(prop);
	}
	int eno=111;
	String ename="dummy";
	float esal=100;
	
	int getWeight(String s) {
		if(s.equals("heavy")) {
			return 100;
		}
		else if(s.equals("lite")){
			return 10;
		}
		else {
			return 50;
		}
	}
}