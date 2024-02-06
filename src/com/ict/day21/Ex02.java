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
import java.net.URLConnection;


//기상청
public class Ex02 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		// save in computer
		String path = "D:/bm/util/webpage02.txt";
		File file = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
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
			;
			bw.write(sb.toString());
			bw.flush();
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			try {
				bw.close();
				br.close();
				isr.close();
				is.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}