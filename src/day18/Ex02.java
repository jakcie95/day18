package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String id ="abcd";
		String pwd = "333";
		while(true) {
			System.out.println("등록아이디 입력");
			id = sc.next();
			File path = new File("D:/박정호_취업반/"+id+".txt");
			if(path.exists()) {// 해당 파일이 존재할떄
				System.out.println("존재하는 아이디 입니다.");
			}else {//해당파일이 없을때
				System.out.println("비밀번호입력");
				pwd = sc.next();
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(id.getBytes());
				fos.write(pwd.getBytes());
				System.out.println("등록되었습니다.");
				break;
		}
		
}
	
	
	}
}
