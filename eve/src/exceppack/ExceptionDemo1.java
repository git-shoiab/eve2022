package exceppack;
//https://fluvid.com/videos/detail/XLE5Zc8RwGH6Gx-9n#.Yilf6AV69QQ.link
public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("before exception....");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("dont pass a zero value..."+e);
		}catch(NumberFormatException ne) {
			System.out.println("please pass a number value..:"+ne);
		}
//		catch(Exception e) {
//			System.out.println("unknown exception...:"+e);
//		}
		finally {
			System.out.println("finally called..");
		}
		System.out.println("after exception...");
	}
}
