package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable {
	Socket s;
	Ex01_Server server;
	// 직렬화 (대상클래스 vo ObjectInputStream, ObjectOutputStream)
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	public Ex01_ServerClients(Socket s, Ex01_Server sever) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream()); //클라이언트 소켓으로부터 데이터를 읽어오기 위한 스트림
			out = new ObjectOutputStream(s.getOutputStream());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//클라이언트가 보낸 프로토콜, 메세지 받는다 
	//클라이언트로부터 받은 객체를 역직렬화하고, 해당 객체의 프로토콜에 따라 적절한 동작을 수행하는 것
	@Override
	public void run() {
		esc: while (true) {
			try {
				// 역직렬화
				Object obj = in.readObject(); // 클라이언트 소켓으로부터 데이터를 읽어와서 객체로 역직렬
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;   //읽어온 객체는 Object 타입으로 반환되므로, 이를 실제 사용할 클래스로 캐스팅
					switch (p.getCmd()) {
					case 0: // 접속해제 (while 밖에서 처리)
						// 받은정보는 그대로 자신에게 보낸다
						out.writeObject(p);
						break esc;
					case 1: // 대화명받기
						nickName = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickName + "님입장");
						server.SendMsg(p);
						break;
					case 2:
						p.setMsg(nickName + ":" + p.getMsg());
						server.SendMsg(p);
						break;

					}
				}
			} catch (Exception e) {

			}
		}
		try {
			// cmd 0이면 접속해제이므로 아래 코딩 실행
			out.close();
			in.close();
			s.close();

			// 자기 자신은 리스트에서 제외
			server.removeClient(this);
			// 자신을 제외하 사람들에게 메세지 전달 하자
			Ex01_Protocol p = new Ex01_Protocol();
			p.setCmd(2);
			p.setMsg(nickName + "님 퇴장");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
