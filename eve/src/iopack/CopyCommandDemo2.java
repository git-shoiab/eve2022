package iopack;
//https://fluvid.com/videos/detail/v_v8rSxx-yiX6Yo3X#.Ynxuyb-JG0Q.link
//https://fluvid.com/videos/detail/zj4k_TvvzzSov_21P#.Ynxw7TaC42g.link
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommandDemo2 {
	public static void main(String[] args) throws Exception{
		
		try(
				
		FileReader fis=new FileReader("newfile.txt");
		FileWriter fos=new FileWriter("copy2.txt");
				
		){
		
		
		int eof=-1;
		int n=0;char b[]=new char[4];
		while((n=fis.read(b))!=eof)		{
			String s=new String(b,0,n);
			System.out.println(s);
			fos.write(b, 0, n);
		}
		}catch(Exception e) {e.printStackTrace();}
		//fos.close();//this is compulsory
	}
}
