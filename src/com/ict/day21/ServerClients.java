package com.ict.day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClients implements Runnable {
	Socket s;
	Ex07_Server server;

	BufferedReader in;
	PrintWriter out;
	String ip;

	public ServerClients(Socket s, Ex07_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				msg += System.lineSeparator();
				if (msg.equalsIgnoreCase("exit")) {
					// 자기자신에게 보낸다
					String exit = "bye";
					// PtinWrtier 는 끝표시 안함
					// exit += System.lineSeparator();
					out.println(exit);
					break;
				}
				server.sendMsg(ip + ":" + msg);

			} catch (Exception e) {

			}
		}
		// 자기자신을 제외 시킨다
		server.removeclient(this);
		String msg2 = ip + "님 퇴장";
		// msg2 += System.lineSeparator();
		// 리스트들에게 보낸다
		server.sendMsg(ip);
	}

}
