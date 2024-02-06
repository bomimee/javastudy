package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	 public static void main(String[] args) throws IOException {
		 
	        ServerSocket serverSocket = new ServerSocket(7000);
	        System.out.println("서버대기");
	        Socket clientSocket = serverSocket.accept();

	        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

	        String inputLine;
	        while ((inputLine = in.readLine()) != null) {
	            out.println("Server: " + inputLine);
	        }

	        in.close();
	        out.close();
	        clientSocket.close();
	        serverSocket.close();
	    }
	}


