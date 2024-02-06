package com.ict.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//BufferedRead => readLine() - 한줄씩읽는다. 더이상 읽을 수없을때  null ( null이면 멈추면된다)
public class Ex06 {
public static void main(String[] args) {
	String path = "D:/bm/util/test05.txt";
	File file = new File(path);
	FileReader fr = null;
	BufferedReader br = null;
	try {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String msg = null;
		while ((msg = br.readLine())!= null) {
			
			System.out.println(msg);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
