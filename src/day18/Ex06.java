package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class AAA implements Serializable{
	String name;
	String addr;
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
public class Ex06 {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	String name, addr;
	
	String path = "D:/박정호_취업반/자바 파일입출력/"; //직렬화 : 객체를 바이트로 변환해서 출력
									//역직렬화 : 바이트를 객체형식으로 변환
	AAA info = null;
	System.out.println("1.저장");
	System.out.println("2.가져오기");
	System.out.println("3.수정");
	System.out.println("4.삭제");
	System.out.println("5.검색");
	int num = sc.nextInt();
	
	
	
	if(num == 1) {//저장
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("주소 입력");
		addr = sc.next();
		info = new AAA();
		info.setName(name);
		info.setAddr(addr);
		File path02 = new File(path+name+".txt");
		FileOutputStream fos = new FileOutputStream(path02);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(info);
		
		oos.close(); bos.close(); fos.close();
		System.out.println("저장 되었습니다");
	}else if(num == 2){//가져오기
		File list = new File(path);
		String[]li = list.list();
		for(int i=0; i <li.length; i++) {
			System.out.println(li[i]);
		}
		System.out.println("확인할 이름 입력");
		name = sc.next();
		File p = new File(path+name+".txt");
		
		FileInputStream fis = new FileInputStream(p);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		info = (AAA)ois.readObject();
		System.out.println("이름 : "+info.getName());
		System.out.println("주소 : "+info.getAddr());
	}else if(num == 3) {//수정
		File list = new File(path);
		String name2, addr2;
		String[]li = list.list();
		for(int i=0; i <li.length; i++) {
			System.out.println(li[i]);
		}
		System.out.println("수정할 파일 이름 입력");
		name = sc.next();
		File m = new File(path+name+".txt");
		if(m.exists() == true) {
			m.delete();
			System.out.println("수정할 이름 입력");
			name2 = sc.next();
			System.out.println("수정할 주소 입력");
			addr2 = sc.next();
			info = new AAA();
			info.setName(name2);
			info.setAddr(addr2);
			File modify = new File(path+name2+".txt");
			FileOutputStream fos = new FileOutputStream(modify);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(info);
			
			System.out.println("수정 되었습니다.");
			oos.close(); bos.close(); fos.close();
		}else {
			System.out.println("존재하지 않는 파일명입니다.");
		}
		
	}else if(num == 4) {//삭제
		File list = new File(path);
		String[]li = list.list();
		for(int i=0; i <li.length; i++) {
			System.out.println(li[i]);
		}
		System.out.println("삭제할 파일 이름 입력");
		name = sc.next();
		File d = new File(path+name+".txt");
			if(d.exists() == true) {
			d.delete();
			System.out.println("파일이 삭제되었습니다.");
			}else {
				System.out.println("존재하지 않는 파일입니다");
			}
	}
}
}
