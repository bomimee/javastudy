package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//스트림은 지연이 될수있으므로 버퍼-임시기억 이용해서 지연 현상을 해결
//BufferedOutputStream - > 혼자사용 못함, 항상 아웃풋스트림이랑 짝지어서 사용
public class Ex09 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test01.txt";
		File file = new File(path);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// fos = new FileOutputStream(file); // > 없으면 덮어쓰기
			fos = new FileOutputStream(file, true); // > 이어쓰기
			bos = new BufferedOutputStream(fos);// chain 방식 - 위와 아래 연결

			String msg = "한국 ICT 인재 개발원 \n5 강의장 \n자바실습 중 ";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
