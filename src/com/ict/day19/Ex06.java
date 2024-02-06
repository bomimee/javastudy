package com.ict.day19;

import java.io.File;

/*
 * File Class = 특정위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
 * -주요생성자: File(String pathway), File(String parent, String child), File(File parent, String child)
 * -method : createNewFile, 
 *           mkdir,mkdirs ; make directory 
 *           delete, 
 *           isDirectory ; boolean
 *           exists ; boolean
 *           getName,
 *           length - size in byte ( directory -> no length)
 *           list; 특정위치 내용을 스트링 배열로 만ㄷ르어서 저장
 *           getAbsolutePath 
 *           getPath -상대주소
 *             
 */
public class Ex06 {
public static void main(String[] args) {
	//String pathname = "D:\\bm\\javastudy";
	String pathname = "D:/bm/javastudy";
	File file = new File(pathname);
	String[] arr = file.list();
	for (String k : arr) {
		//System.out.println(k);
		
		File file2 = new File(pathname, k);
		System.out.println(file2);
		if(file2.isDirectory()) {
			System.out.println("디렉토리 : "+ k);
		}else {
			//Byte - KB - MB - GB - TB - PB
			System.out.println("파일 : "+ k +","+k.length());
		}
	}
	
}
}
