package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05_Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			server = new ServerSocket(7000);
			System.out.println("서버대기");
			socket = server.accept();
			// 클라이언트가 요청하기전까지 블록킹된다.
			// System.out.println("accept... ");

			// 입력 스트림을 얻기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			// 서버에 접속한 ip주소 받기
			String ip = socket.getInetAddress().getHostAddress();
			String msg = br.readLine();
			// 들어온문자 받기
			System.out.println(ip + ":" + msg);

			// 클라이언트에게 보낼 출력 스트림 얻기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);

			bw.write(msg);
			bw.flush();
		} catch (IOException e) {
			System.out.println("server error");
			e.printStackTrace();

		} finally {
			try {
				// 서버는 이거잘안씀
				br.close();
				isr.close();
				is.close();

				bw.close();
				osw.close();
				os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
