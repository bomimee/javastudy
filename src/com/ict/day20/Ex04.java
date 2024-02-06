package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter : newLine(); ->줄바꿈
public class Ex04 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test06.txt";
		File file = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(fw);
			fw = new FileWriter(file);
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("12345");
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.write("안녕하세요");

			fw.flush();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				//bw.close();
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
