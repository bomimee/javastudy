package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Ex03_Server {
	List<Ex03_ServerClients> list;
	ServerSocket ss;

	public Ex03_Server() {
		try {
			list = new ArrayList<Ex03_ServerClients>();
			ss = new ServerSocket(7777);
			System.out.println("server ~");
			play();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void play() {
		while (true) {
			try {
				Socket s = ss.accept();
				Ex03_ServerClients sc = new Ex03_ServerClients(s, this);
				new Thread(sc).start();
				list.add(sc);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void sendMsg(Ex03_Protocol p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void removeClient(Ex03_ServerClients sc) {
		list.remove(sc);
	}

	public void picture(Ex03_Protocol p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {

		new Ex03_Server();
	}
}
