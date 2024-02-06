package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrintStream 은 모든 데이터를 출력할수있다
//PrintWriter 모든 데이터 출력할수있다.(OutputStream-byte // Writer-문자출력 => 둘다가능)

public class Ex07 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test07.txt";
		File file = new File(path);
		FileWriter fw = null;
		PrintWriter pw = null;

		String path2 = "D:/bm/util/test08.txt";
		File file2 = new File(path2);
		FileOutputStream fos = null;
		PrintWriter pw2 = null;

		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);

			pw.println("printWriter");
			pw.println(false);
			pw.println(123456);
			pw.println(179.77);
			pw.println('A');
			pw.flush();

			fos = new FileOutputStream(file2);
			pw2 = new PrintWriter(fos);

			pw2.println("printWriter2");
			pw2.println(false);
			pw2.println(123456);
			pw2.println(179.77);
			pw2.println('A');
			pw2.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pw2.close();
				pw.close();
				fw.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
