package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileInputStram = 1byte, read() =>아스키코드-숫자대소문자, read(byte[] b)
//FileReader = 2byte, read() => 유니코드-숫자,전세계문자표현가능 : read(char[] c)
public class Ex05 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test05.txt";
		File file = new File(path);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

			// 한글자 읽기 (숫자 => 형변환)
//			int k = fr.read();
//			System.out.println(k + ":" + (char) (k));

			// 전체읽기
//			int k1 = 0;
//			while ((k1 = fr.read()) != -1) {
//				System.out.println(k1 + ":" + (char) (k1));
//			}
			// 배열처리
			char[] c = new char[(int) (file.length())];
			fr.read(c);
//			for (char d : c) {
//				System.out.print(d);
//			}
			String msg =  new String(c).trim();
			System.out.println(msg);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
