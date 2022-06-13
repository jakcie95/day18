package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {
public static void main(String[] args) throws Exception {
	File path = new File("D:/박정호_취업반/aaa.txt");
	FileInputStream fis = new FileInputStream(path);
	while(true) {
	Thread.sleep(1000);
	int res = fis.read();
	//System.out.println("res : "+res);
	if(res < 0) 
		break;
	System.out.println((char)res);
	}
}
}
