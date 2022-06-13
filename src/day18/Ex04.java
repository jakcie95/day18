package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex04 {
public static void main(String[] args) throws Exception {
	File path = new File("D:/박정호_취업반/aaa.txt");
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	for(int i ='1'; i < '9'; i++) {
		//Thread.sleep(1000);
		bos.write(i);
	}
	bos.flush();
}
}
