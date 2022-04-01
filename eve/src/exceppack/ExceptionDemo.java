package exceppack;
//https://fluvid.com/videos/detail/ZEn3MT8-GRc9DjVXe#.YkZhvSWYses.link
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after exception...");
	}
}
