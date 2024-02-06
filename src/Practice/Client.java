package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.26", 7000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        System.out.println("입력창");
		String userInputLine;
	
        while ((userInputLine = userInput.readLine()) != null) {
        	userInputLine = scan.nextLine();
        	out.println(userInputLine);
            System.out.println("Server says: " + in.readLine());
        }

        out.close();
        in.close();
        userInput.close();
        socket.close();
    }
}
