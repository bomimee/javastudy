package com.ict.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//DataInputStream, DataOutputStream
//기본자료형의 데이터를 주고받을때 사용
//입력순서와 출력순서를 맞춰야한다. 
/*기본생성자가 없어서 버퍼드스트림처럼 파일스트림을 이용하자
 *DataInputStream을 사용해야 읽을 수 잇다.  
 * 언어가 다르거나 기계가 다를때 사용하지 자바안에서는 사용을 거의안함 
 */
public class Ex01 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test03.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {// 출력준비완료
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);

			// write+기본자료형
			dos.writeChar(97);
			dos.writeChar('D');
			dos.writeBoolean(true);
			dos.writeDouble(178.95);
			dos.writeInt(84);
			dos.writeChar('가');
			dos.flush();

			// 읽기위해서 필요한것
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			// 읽기 - 위에와  순서가 중요하다 
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				dis.close();
				dos.close();
				fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
