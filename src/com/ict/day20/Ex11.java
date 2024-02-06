package com.ict.day20;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAdress: 자바에서 아이피주소를 표현하는 클래스
/*생성자는 존재하지만 사용하지 못함 
 * 6개의 스태틱메서드를 이용한다
 * 로컬호스트 란 현재 내가 사용하고 있는 컴퓨터를 말한다
 * 
 */
public class Ex11 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println(addr.getHostName());
			System.out.println(addr.getHostAddress());
			System.out.println(addr.toString());
			System.out.println();

			addr = InetAddress.getByName("www.google.com");
			System.out.println(addr.getHostName());
			System.out.println(addr.getHostAddress());
			System.out.println(addr.toString());
			System.out.println();

			byte[] b = { (byte) (233), (byte) (130), (byte) (195), (byte) (95) };
			addr = InetAddress.getByAddress(b);
			System.out.println(addr.getHostName());
			System.out.println(addr.getHostAddress());
			System.out.println(addr.toString());
			System.out.println();

			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress k : arr) {
				System.out.println(k.getHostName());
				System.out.println(k.getHostAddress());
				System.out.println(k.toString());
				System.out.println();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
