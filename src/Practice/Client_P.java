package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_P {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.0.26", 7000);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("입력창");
			String msg = scan.nextLine();
			bw.write(msg + "\n");
			bw.flush();

			String getMsg = br.readLine();
			System.out.println("return:" + getMsg);
		}

	}
}
