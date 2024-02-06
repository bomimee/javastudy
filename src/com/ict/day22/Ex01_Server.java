package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex01_Server {
	ArrayList<Ex01_ServerClients> list = null;
	ServerSocket ss = null;

	public Ex01_Server() {
		list = new ArrayList<Ex01_ServerClients>();
		try {
			ss = new ServerSocket(7009);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("server ~~");

		play();

	}

	public void play() {
		while (true) {
			try {
				Socket s = ss.accept();
				Ex01_ServerClients clients = new Ex01_ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 모든 리스트에 있는 사람에게 메세지 전달
	public void SendMsg(Ex01_Protocol p) {
		for (Ex01_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 리스트에서 자기자신을 삭제하는 메서드
	public void removeClient(Ex01_ServerClients sc) {
		list.remove(sc);
	}

	public static void main(String[] args) {
		new Ex01_Server();
	}

}
