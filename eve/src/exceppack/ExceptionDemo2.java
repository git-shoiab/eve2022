package exceppack;
//https://fluvid.com/videos/detail/ZEn3MT8-GRc9DjVXe#.YkZhvSWYses.link
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
//		catch(NumberFormatException ne) {
//			
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after exception...");
	}
}
