package utilpack;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo5 {
	public static void main(String[] args) {
		Random r=new Random();
		Set<Integer> myset=new TreeSet<Integer>();
//		for(int i=0;i<10;i++) {
//			//System.out.println(r.nextInt(100));
//			myset.add(r.nextInt(100));
//		}
//		System.out.println(myset);
//		System.out.println(myset.size());
		
		while(true) {
			myset.add(r.nextInt(100));
			if(myset.size()==10) {
				break;
			}
		}
		System.out.println(myset);
		System.out.println(myset.size());
	}
}
