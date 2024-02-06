package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String path = "D:/bm/util/exam01.txt";//만들고자하는 파일입력
		File file = new File(path);
		try {
			boolean b1 = file.createNewFile();
			if (b1)
				System.out.println("s");
			else {
				System.out.println("f");
			}

			System.out.println();
			File file2 = new File("D:/bm/util/kkk/yyy");//디렉토리생성
			boolean b2 = file2.mkdirs();
			if (b2)
				System.out.println("s");
			else
				{System.out.println("f");}
			
			String pathname = "D:/bm/util/exam01.txt";
					File file4 = new File(pathname);
			boolean b3 = file4.delete();
			if(b3) System.out.println("s");
			else
			{System.out.println("f");}
			

			String pathname3 = "D:/bm/util/kkk/yyy";
			File file5 = new File(pathname3);
			boolean b5 = file5.delete();
			if(b5) System.out.println("s");
			else
			{System.out.println("f");}
			
			
			String pathname2 = "D:/bm/util/kkk";
			File file3 = new File(pathname2);
			boolean b4 = file4.delete();
			if(b4) System.out.println("s");
			else
			{System.out.println("f");}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
