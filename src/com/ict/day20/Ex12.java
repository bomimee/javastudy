package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL(Uniform Resource Locator) ; 인터넷에서 접근가능한 자원의 주소
// URL class 해당위치의 자원의 결과만 가져온다. 
// final class -> 상속안됨
public class Ex12 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		// 내 컴퓨터에 저장
		String path = "D:/bm/util/webpage01.txt";
		File file = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			URL url = new URL("https://comic.naver.com/index");
			is = url.openStream();  // url 정보를 openstream 으로 가져올수있다.
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			String msg = null;
			// 스트링의 여러번 +를 사용하면 메모리에 쓸데없는 공간들이 만들어진다.
			// 그걸 해결하기위해 StringBuffer 나 StringBuilder 를 사용한다 = 둘이 같다
			// + 대신 append 라는 메소드로 추가
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				System.out.println(msg + "\n");
				sb.append(msg + "\n"); // while 문을 돌면서 append가 계속 스트링이 쌓이게한다.

			}
			// System.out.println(sb.toString()); //자료형을 스트링으로 만들어준다.

			// file save
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();

		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
