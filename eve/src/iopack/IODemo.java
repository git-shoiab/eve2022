package iopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class IODemo {
	public static void main(String[] args)throws Exception {
		
		File file=new File("newfile.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead()+":"+file.canWrite());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		file.renameTo(new File("newfile.txt"));
		
		FileInputStream fis=new FileInputStream(file);
		
		FileReader fr=new FileReader(file);
		
		
	}
}
