package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_P2 implements Runnable {
	ServerSocket server;
	Socket socket;
	BufferedWriter bw;
	BufferedReader br;

	public Server_P2() throws IOException {
		server = new ServerSocket(7000);
		System.out.println("server..........");
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				// 클라이언트가 요청하기전까지 블록킹된다.
				socket = server.accept();
				// 입력 스트림을 얻기
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 클라이언트에게 보낼 출력 스트림 얻기
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				// 들어온문자 받기
				String msg;
				while ((msg = br.readLine()) != null) {
					// 서버에 접속한 ip주소 받기
					String ip = socket.getInetAddress().getHostAddress();
					System.out.println(ip + ":" + "online" + msg);
					bw.write("Server: " + msg);
					bw.newLine();
					bw.flush();

				}
				// Read from the socket
				String msg1 = br.readLine();
				if (msg1 == null) {
					// Client disconnected, handle accordingly
					System.out.println("Client disconnected");
					break; // exit the loop
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				// Close resources in a finally block
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (socket != null && !socket.isClosed())
					socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new Server_P2();

	}
}
