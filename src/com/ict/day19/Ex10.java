package com.ict.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//바이트 입력스트림 - 아웃풋스트림의 자식클래스 파일인웃풋스트림 사용
// FileInputStream ; 해당파일에 내용을 1바이트 쓰기(입력) ->한글,한자 안됨
// 주요메서드 - read(int b); int => 아스키코드 0-255, 한글자
//             해당 숫자를 문자로 보려면 char 형변환
//             만약 읽을수 없으면 -1 나온다
// read(byte[] b) : 배열b에 존재하는 아스키코드 입력
// 스트링 클래스에 겟바이트 이용하면 바이트어레이로 만들어진다
// flush(): 출력 버퍼용량이 다 차지 않아도 바로 출력하게 만듦.
// close(): 출력 스트림닫기
// 파일만들위치 지정

public class Ex10 {
	public static void main(String[] args) {
		String path = "D:/bm/util/test02.txt";
		File file = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);

			// 1 byte 읽기
//			int i = fis.read();
//			System.out.println(i);
//			System.out.println((char)(i));
//			int b = 0;
//			while (true) {
//				b = fis.read();
//				if (b == -1)
//					break;
//				System.out.println(b + ":" + (char) (b));
//			}
//			while((b=fis.read()) !=-1) {
//			System.out.println(b + ":" + (char) (b));				
//			}			
			byte [] b = new byte[(int) file.length()]; 
			// fis 가 가르키는 파일의 내용을 byte[] b 에 모두 넣어준다. 
			fis.read(b);
			//한글 안나옴 
//			for (byte k : b) {
//				System.out.println(k + ":" + (char) (k));
//			}
			//스트링 이용하면 한글한자 안깨짐 
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
