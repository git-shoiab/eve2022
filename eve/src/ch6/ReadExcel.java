package ch6;

public class ReadExcel {
	public static void main(String[] args) {
		String filePath = "d:/file.xlsx";
		Workbook workbook = new Workbook(filePath);
		Worksheet worksheet = workbook.getWorksheets().get(0);
		PictureCollection pics = worksheet.getPictures();
		//Write all the extracted images on disk
		for(int i=0; i<pics.getCount(); i++)
		{
		Picture pic = pics.get(i);
		byte[] picBytes = pic.getData();
		String picExtension = pic.getImageFormat().getName();
		FileOutputStream fout = new FileOutputStream(“image_”+ i + “.” + picExtension);
		fout.write(picBytes);
		fout.close();
		}
	}
}
