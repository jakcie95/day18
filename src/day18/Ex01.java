package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 파일입출력
 - 디스크에 저장하는 방식
 - 영구저장을 하기위해 사용
 */
public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("D:/박정호_취업반/aaa.txt");
	//stream : 연결통로
	FileOutputStream os = new FileOutputStream(path);
	os.write('A');
	os.write(97);
	
	String s = "hello";
	os.write(s.getBytes());
	
	}
}
