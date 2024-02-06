package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream 은 모든 데이터를 출력할수있다.(입력없음)
 * 기본생성자가 없어서 버퍼드스트림처럼 파일스트림이용
 */
public class Ex02 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test04.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		PrintStream ps = null;
		try { //fos- ps 순서바뀌니까 에러남
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);
			
			//기본자료형 + String 출력 = System.out.Println 과 똑같음 
			ps.println('A'); //쓰는 객체가 달라짐. 시스템아웃은 모니터에 출력, ps.println 은 파일을 가리킴
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello Java");
			ps.println(92);
			ps.println("자바");
			ps.println();
			ps.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
