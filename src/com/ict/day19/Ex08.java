package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 스트림 : 데이터를 원하는 목적지까지 입출력하는 방법
	종류: 바이트 스트림, 문자스트림, 객체 스트림
	1.바이트스트림: 모든 처리르 1바이트 처리
	대상 - 바이트로 이루어진 모든파일(사진, 동영상, 소리..)
	최상위클래스 : 인풋스트림, 아웃풋스트림 
	2.문자스트림 ; 모든 처리를 2바이트로(사람위주)
	대상= 전세계모든 문자로 구성된 파일 입출력에 적합
	최상위클래스 : 리더(입력), 라이터(출력)
	1-2. 결합스트림 ; 바이트스트림 => 문자스트림
	기계를 통해 입출력된 정보를 사람이 알아볼수있게 입출력
	최상위클래스 : 인풋스트림리더, 아웃풋스트림라이터 
	3.오브젝트 스트림 ; 객체직렬화 후 객체 단위로 입출력
	대상 - 객체
	최상위클래스 - 오브젝트인풋스트림(리드오브젝트메서드 - 객체역직렬화)
	         오브젝트아웃풋스트림(라이트오브젝트메서드 - 객체직렬화)
 */
public class Ex08 {
	public static void main(String[] args) {
		// 바이트 출력스트림 - 아웃풋스트림의 자식클래스 파일아웃풋스트림 사용
		// FileOutputStream ; 해당파일에 내용을 1바이트 쓰기(출력) ->한글,한자 안됨
		// 주요메서드 - write(int b); int => 아스키코드 0-255, 한글자
		// 아스키코드(숫자,소문자,대문자,일부 특수문자만가능)
		// write(byte[] b) : 배열b에 존재하는 아스키코드 출력
		// 스트링 클래스에 겟바이트 이용하면 바이트어레이로 만들어진다
		// flush(): 출력 버퍼용량이 다 차지 않아도 바로 출력하게 만듦.
		// close(): 출력 스트림닫기
		// 파일만들위치 지정
		String path = "D:/bm/util/test01.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		try {//파일이 존재하면 덮어쓰기, 안존재하면 생성
			fos = new FileOutputStream(file);
			fos.write(106);
			fos.write(97);
			fos.write(118);
			fos.write(97);
			fos.write(13);
			fos.write('h');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(13);
			
			//
			//String.getBytes() 여러글자 사용가능
			String msg = "H!~~\n안녕\nbye";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
	}
}
