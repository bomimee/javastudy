package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//OutputStreamWriter : byte 스트림을 문자스트림으로 변경 (출력)
//OutputStream => OutputStreamWriter  => 버퍼드라이터로 바꿔서쓴다

//InputStreamReader :byte 스트림을 문자스트림으로 변경 (입력)
//InputStream =>InputStreamReader =>BufferedReader
public class Ex08 {
	public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	System.out.println(" : ");
//	String msg = scan.next();
//	
//	System.out.println("msg : " + msg);

		// 출력이먼저  (스캐너와 똑같음)
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			osw = new OutputStreamWriter(System.out); // 모니터로 출력

			bw = new BufferedWriter(osw);

			bw.write(" : ");
			bw.flush();
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			bw.write(" : " + msg);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
