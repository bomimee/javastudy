package com.ict.day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//FileOutputStream => 1byte, write (int C), write(byte[] b)
//FileWriter => 2byte, write(int c) write(char[] c), write(String str)
public class Ex03 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test05.txt";
		File file = new File(path);
		FileWriter fw = null;
		try {
			String str = "안녕하세요\n12345\ndjfkek\n";
			fw = new FileWriter(file);
			fw.write(str);
			fw.flush();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
