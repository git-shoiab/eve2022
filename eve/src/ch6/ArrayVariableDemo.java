package ch6;
//https://fluvid.com/videos/detail/mv1dViwLEat7xX3YB#.YhRM5epU0n4.link
public class ArrayVariableDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		ArrayVariableDemo obj=new ArrayVariableDemo();
//		System.out.println("Before passing...:"+arr[1]);
//		obj.pass(arr);//this is pass by reference - in arrays the default is pass by reference
//		System.out.println("After passing...:"+arr[1]);
		
		//1-solution - anonymous array
		
		obj.pass(new int[] {10,20,30,40});
		
		//2-solution - create a copy and send
		
		int carr[]=new int[4];
		
		System.arraycopy(arr, 0, carr, 0, 4);
		
		System.out.println("Before passing...:"+arr[1]);
		obj.pass(carr);//this is pass by reference - in arrays the default is pass by reference
		System.out.println("After passing...:"+arr[1]);
		
		System.out.println(carr[1]);
	}
	
	void pass(int a[]) {
		a[1]=20202020;
	}
}
