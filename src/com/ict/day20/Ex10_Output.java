package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex10_Output {
	public static void main(String[] args) {
		Ex10_VO vo = new Ex10_VO("go", 29, 79.3, true);
		Ex10_VO vo1 = new Ex10_VO("go", 29, 79.3, true);
		Ex10_VO vo2 = new Ex10_VO("go", 29, 79.3, true);
		Ex10_VO vo3 = new Ex10_VO("go", 29, 79.3, true);
		Ex10_VO vo4 = new Ex10_VO("go", 29, 79.3, true);
		Ex10_VO vo5 = new Ex10_VO("go", 29, 79.3, true);

		String path = "D:/bm/util/object02.txt";
		File file = new File(path);
		// 직렬화 (파일로 저장)
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			// 객체 직렬화

//2 객체 여럭일대 객체를 컬렉션으로 모으자
			ArrayList<Ex10_VO> list = new ArrayList<>();
			list.add(vo);
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);

			//
			oos.writeObject(list);
			oos.flush();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
				bos.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}
