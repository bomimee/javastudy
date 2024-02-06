package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex10_Input {
	public static void main(String[] args) {
		String path = "D:/bm/util/object02.txt";
		File file = new File(path);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			// 한개 역직렬화
			Ex10_VO vo = (Ex10_VO) ois.readObject();
			Ex10_VO vo1 = (Ex10_VO) ois.readObject();
			Ex10_VO vo2 = (Ex10_VO) ois.readObject();
			Ex10_VO vo3 = (Ex10_VO) ois.readObject();
			Ex10_VO vo4 = (Ex10_VO) ois.readObject();
			Ex10_VO vo5 = (Ex10_VO) ois.readObject();
			// 화면 출력
			System.out.println("이름\t나이\t몸무게\t성별");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getAge() + "\t");
			System.out.println(vo.getWeight() + "\t");

			if (vo.isGender()) {
				System.out.println("M");
			} else {
				System.out.println("F");
			}

			// 2. 여러개
			ArrayList<Ex10_VO> list = (ArrayList<Ex10_VO>) ois.readObject();
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex10_VO k : list) {

				System.out.println(k.getName() + "\t");
				System.out.println(k.getAge() + "\t");
				System.out.println(k.getWeight() + "\t");
				if (k.isGender()) {
					System.out.println("M");
				} else {
					System.out.println("F");
				}
			}
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
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
