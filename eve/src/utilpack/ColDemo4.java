package utilpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {
	public static void main(String[] args) {
		//Set<String> myset=new HashSet<String>();
		TreeSet<String> myset=new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
		myset.add("ball");
		myset.add("apple");
		myset.add("dog");
		myset.add("cat");
		myset.add("cat");
		
		System.out.println(myset);
		
		//Collections.sor
		Iterator<String> iter=myset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
