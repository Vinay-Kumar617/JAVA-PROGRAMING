package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ReadFolderFiles {
 public static void main(String[] args) throws IOException {
	File f1=new File("D:/Folder");
	f1.mkdir();
	File f2=new File("D:/Folder/pori.txt");
	f2.createNewFile();
	File f3=new File("D:/Folder/bonda.txt");
	f3.createNewFile();
	File f4=new File("D:/Folder/idly.txt");
	f4.createNewFile();
	File [] ff=f1.listFiles();
	for(File ele:ff) {
		System.out.println(ele);
	}
	//for knowing last modified date
	long l=f3.lastModified();
	Date d=new Date(l);
	System.out.println(d);
}
}
