package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_P {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(7002);
		System.out.println("서버대기");
		Socket socket = server.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String ip = socket.getInetAddress().getHostAddress();
		String msg;
		while ((msg = br.readLine()) != null) {
			System.out.println(ip + ":" + msg);
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		bw.write(msg);
		bw.flush();
		// 서버에 접속한 ip주소 받기

		// 들어온문자 받기

	}

}
