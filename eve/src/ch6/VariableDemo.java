package ch6;
//https://fluvid.com/videos/detail/R_4m9Svz7VFMp9Xy8#.YhRJCSCSjA0.link
public class VariableDemo {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();//complex type - object based - original is passed
		
		int age;//simple type or primitive type - value based - copies will be created when passed
		
		VariableDemo vd=new VariableDemo();
		//System.out.println("before passing...:"+laddu.size);
		//vd.pbv(laddu.size);//copy is passed - because primitive types are pass by value
		//System.out.println("after passing...:"+laddu.size);
		
		System.out.println("REFERENCE-before passing...:"+laddu.size);
		vd.pbr(laddu);//original is passed - because complex types are pass by reference
		System.out.println("REFERENCE-after passing...:"+laddu.size);
	}
	
	void pbv(int size) {
		size=5;
	}
	void pbr(Laddu lad) {
		lad.size=5;
	}
}


class Laddu{
	int size=10;
}