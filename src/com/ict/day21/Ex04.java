package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//메이크업
public class Ex04 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		String path = "D:/bm/util/webpage04.txt";
		File file = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			URL url = new URL("http://makeup-api.herokuapp.com");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = null;
			StringBuffer sb = new StringBuffer();

			while ((msg = br.readLine()) != null) {
				System.out.println(msg + "\n");
				sb.append(msg + "\n");
			}

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				br.close();
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
