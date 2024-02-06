package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//ObjectInputStream  - 객체입력스트림
//readObject() 객체 역직렬화메서드
public class Ex09_Input {
	public static void main(String[] args) {

		String path = "D:/bm/util/object01.txt";
		File file = new File(path);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			//bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(fis);

			// 한개 역직렬화
			Ex09_VO vo = (Ex09_VO) ois.readObject();
//			// 화면 출력
			System.out.println("이름\t나이\t몸무게\t성별");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.print(vo.getWeight() + "\t");

			if (vo.isGender()) {
				System.out.println("M");
			} else {
				System.out.println("F");
			}

			// 2. 여러개역직렬화
//			ArrayList<Ex09_VO> list = (ArrayList<Ex09_VO>) ois.readObject();
//			System.out.println("이름\t나이\t몸무게\t성별");
//			for (Ex09_VO k : list) {
//
//				System.out.println(k.getName() + "\t");
//				System.out.println(k.getAge() + "\t");
//				System.out.println(k.getWeight() + "\t");
//				if (k.isGender()) {
//					System.out.println("M");
//				} else {
//					System.out.println("F");
//				}
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				ois.close();
				//bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
