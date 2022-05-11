package utilpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//https://fluvid.com/videos/detail/8EL-9T--3_i59Yexn#.YnsY-qiiXdQ.link
public class MapDemo1 {
	public static void main(String[] args) {
		//HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		//TreeMap<Integer,String> hm=new TreeMap<Integer, String>();
		
		TreeMap<Integer,String> hm=
				new TreeMap<Integer, String>((n1,n2)->{return n2.compareTo(n1);});
		
		hm.put(100, "saravanan");
		hm.put(300, "raja");
		hm.put(200, "baja");
		hm.put(20, "rararara");
		
		System.out.println(hm);
		
		System.out.println(hm.get(200));
		
		Set<Map.Entry<Integer,String>> set=hm.entrySet();
		
		Iterator<Map.Entry<Integer,String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
