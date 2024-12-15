package Basics;
import java.io.*;
public class IStream{
	public static void main(String[] args) throws IOException {
		FileInputStream myFileIn = null;
		FileOutputStream myFileOut = null;
		try {
			myFileIn = new FileInputStream("C:\\Users\\user\\Documents\\java\\file.txt");
			myFileOut = new FileOutputStream("C:\\Users\\user\\Documents\\java\\fileOut.txt");
			
			int content;
			while((content=myFileIn.read())!=-1) {
				myFileOut.write((byte)content);
			}
		}
		finally {
			myFileIn.close();
			myFileOut.close();
			System.out.println("The file has been written to");
		}
	}
}