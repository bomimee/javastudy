package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		String inputPath = "D:/bm/util/img01.jpg";
		String outputPath = "D:/bm/img01.jpg";

		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		File out_file = new File(outputPath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);

			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			bos.flush();
//원본삭제

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		boolean s = in_file.delete();
		if (s)
			System.out.println("s");
		else
			System.out.println("f");

	}
}
