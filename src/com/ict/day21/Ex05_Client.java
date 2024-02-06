package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력창");
		String msg = scan.nextLine();
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			// 서버에 접속
			socket = new Socket("192.168.0.26", 7000);

			// 입출력스트림얻기 , 문자열보내기

			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg +"\n");
			bw.flush();
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String getMsg = br.readLine();
			System.out.println("return:"+getMsg);
		} catch (Exception e) {
			System.out.println("client error");
		} finally {
			try {
				
				br.close();
				isr.close();
				is.close();
				
				bw.close();
				os.close();
				osw.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
