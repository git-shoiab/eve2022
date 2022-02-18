package ch6diffpack;

import ch6.AccessDemo;//namespace link

public class AccessDemoDiffPackSubClass extends AccessDemo{
	void met() {
		//System.out.println(pri);//class scope
		//System.out.println(nomod);//package scope
		System.out.println(pro);
		System.out.println(pub);
	}
}


class AccessDemoDiffPackNonSubClass{
	void met() {
		AccessDemo obj=new AccessDemo();
		//System.out.println(obj.pri);//class scope
		//System.out.println(obj.nomod);//package scope
		//System.out.println(obj.pro);//relation scope
		System.out.println(obj.pub);
	}
}