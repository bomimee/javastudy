package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent_P2 implements Runnable {
	private Socket socket;
	private BufferedWriter serverWriter;
	private BufferedReader serverReader;

	public Cilent_P2() throws UnknownHostException, IOException {
		socket = new Socket("192.168.0.26", 7000);
		serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Initialize serverReader
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.print("입력창 : ");
				String msg = scan.nextLine();
				sendMessage(msg);
				// Now, you can read the response from the server
				String getMsg = serverReader.readLine();
				System.out.println("return:" + getMsg);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sendMessage(String message) {
		try {
			// Writing the message to the server using the BufferedWriter associated with
			// the socket's output stream

			serverWriter.write(message);
			serverWriter.newLine(); // Assuming each message is a line, you might need to adjust this based on your
									// protocol
			serverWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		Cilent_P2 client = new Cilent_P2();

	}
}