package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	File path = new File("D:/박정호_취업반/abcd1234/test.txt");
	String name, age, addr;
	
	while(true) {
		System.out.println("이름입력");
		name =sc.next();
		System.out.println("나이입력");
		age = sc.next();
		System.out.println("주소입력");
		addr = sc.next();
		FileOutputStream os = new FileOutputStream(path);
		os.write(name.getBytes());
		System.out.println();
		os.write(age.getBytes());
		System.out.println();
		os.write(addr.getBytes());
		break;
	}
}
}
