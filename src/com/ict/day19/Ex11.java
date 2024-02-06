package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

//스트림은 지연이 될수있으므로 버퍼-임시기억 이용해서 지연 현상을 해결
//BufferedInputStream - > 혼자사용 못함, 항상 아웃풋스트림이랑 짝지어서 사용
public class Ex11 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test02.txt";
		File file = new File(path);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			byte [] b = new byte[(int) file.length()];
			bis.read(b);
 			String msg = new String(b);
 			System.out.println(msg);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
