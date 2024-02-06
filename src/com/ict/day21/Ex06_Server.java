package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_Server implements Runnable {
	ServerSocket server = null;
	Socket socket = null;

	InputStreamReader isr = null;
	BufferedReader br = null;

	OutputStreamWriter osw = null;
	BufferedWriter bw = null;

	public Ex06_Server() {
		try {
			server = new ServerSocket(7001);
			System.out.println("server...");

			new Thread(this).start(); // 자기자신이 runnable 같고있음

		} catch (Exception e) {

		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				socket = server.accept();
				isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);
				String msg = br.readLine();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + ":" + "님 접속");
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
			}

		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Ex06_Server();

	}
}
