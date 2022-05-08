package utilpack;
//https://fluvid.com/videos/detail/5Ad-5CB1MOIARLR6D#.YnXggiu8HMs.link
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ColDemo1 {
public static void main(String[] args) {
	int arr[]=new int[4];
	//ArrayList<String> alist=new ArrayList<>();
	//LinkedList<String> alist=new LinkedList();
	Vector<String> alist=new Vector<>();
	System.out.println("After Creating...:"+alist.size());
	alist.add("rahim");
	alist.add("ram");
	alist.add("john");
	
	System.out.println("After adding...:"+alist.size());
	
	alist.remove(1);
	
	System.out.println("After removing...:"+alist.size());
	
	System.out.println(alist.get(1));
	
	for(int i=0;i<alist.size();i++) {
		System.out.println(alist.get(i));
	}
	
	for(String s:alist) {
		System.out.println(s);
	}
	
	Iterator<String> iter=alist.iterator();
	while(iter.hasNext()) {
		System.out.println("....."+iter.next());
	}
	while(iter.hasNext()) {
		System.out.println("*************:"+iter.next());
	}
	
	ListIterator<String> liter=alist.listIterator();
	//alist.add("bbbbbbbbbbbbbbbb");
	while(liter.hasNext()) {
		System.out.println("nnnnnnnnnnnnnnnnnn..:"+liter.next());
	}
	while(liter.hasPrevious()) {
		System.out.println("pppppppppppppppp...:"+liter.previous());
	}
	//only for vector
	Enumeration<String> en=alist.elements();
	alist.add("bbbbbbbbbbbbbbbb");
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	System.out.println(alist.contains("rahim"));
	
	System.out.println(alist);
	Collections.sort(alist);
	System.out.println(alist);
}
}
