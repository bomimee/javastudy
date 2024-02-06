package com.ict.day06;

import java.util.Iterator;

public class Ex09 {
	public static void main(String[] args) {
		String str = "ICT 인재개발원 5강의장";

		// charAt(int index) : char
		// 위치정보 (index. 0~)가 숫자로 들어오면 해당위치에 존재하는 문자 반환
		char c1 = str.charAt(7);
		System.out.println(c1);

		str = "대한민국 I Love You 1004 ♥";
		// str 모든 글자를 대문자를 만들자 (소문자는 대문자에 -32)
		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if (c2 > 'a' && c2 < 'z') {
				c2 = (char) (c2 - 32); // --> int 가 되니까 char로 바꿔줘야함
			}
			System.out.print(c2);
		}
		// concat (String str) : String
		// 합친다
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);

		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4);

		// contains (CharSequence s): boolean
		// CharSequence 는 char 값을 순서대로 읽는다
		// String 을 넣어주면 해당 문자열에 입력된 스트링 존재하면 트루, 아니면 폴스
		String s5 = "nojm73@gmail.com";
		boolean res = s5.contains("@");
		System.out.println(res);
		System.out.println(s5.contains(".com"));
		System.out.println(s5.contains(".COM")); // 대소문자 구별

		// equals (Object anObject): boolean
		// 입력된 문자열과 현재 문자열이 같으면 트루, 아니면 폴스 // 대소문자 구별
		// equalsIgnoreCase (String anotherString): boolean
		// 입력된 문자열과 현재 문자열이 같으면 트루, 아니면 폴스 //대소문자 구별안한다
		// ** 문자열과 문자열 비교할때 == 사용 안함

		String s6 = "Korea";
		String s7 = "KOREA";

		if (s6.equals(s7)) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}
		// format (String format, Object.... args): static String
		// 형식 지정 형식에 맞춰 문자열 생성
		String s8 = "한국 ICT  인재 개발원";

		// %s 문자열
		String s9 = String.format("@@ %s !! 화이팅", s8);
		System.out.println(s9);

		// %30s 30자리 차지하는 문자열 (남은자리는 비워둔다.) 오른쪽정렬
		String s10 = String.format("%30s", s8);
		System.out.println(s10);

		// - 는 왼쪽정렬
		String s11 = String.format("%-30s", s8);
		System.out.println(s11);
		String s12 = String.format("%6s !!", s8);
		System.out.println(s12);

		// %d 정수형식
		int k1 = 2134;
		String s13 = String.format("%d", k1);
		System.out.println(s13);
		String s14 = String.format("%5d $$", k1);
		System.out.println(s14);
		String s15 = String.format("%-5d @@", k1);
		System.out.println(s15);

		// %f 실수형식
		double s16 = 123.445678;
		String s17 = String.format("%f", s16);
		System.out.println(s17);

		String s18 = String.format("%.2f", s16);
		System.out.println(s18);

		String s19 = String.format("%.4f", s16);
		System.out.println(s19);

// getByte(): byte[]
//해당 문자열을 byte[]변환
//보통 입출력할때 사용 (대소문자, 숫자 가능 영어외 글자 안됨)
// 나중에 [] 배열을 배운 후에 한다
// indexOf(int ch), indexOf(String sr): int
// 입력된 문자(ch), 문자열(str)  위치값 아려준다
// 문자나 문자열이 없으면 -1 반환

		String h1 = "BufferedReader";
		int h2 = h1.indexOf('R');
		System.out.println(h2);

		h2 = h1.indexOf("er");
		System.out.println(h2);
		h2 = h1.indexOf("err");
		System.out.println(h2);

//indexOf(int ch, int fromIndex, indexOf(String str, int fromIndex) : int
//fromIndex 는 시작위치
//2 ,3  번째 무자나 글자를 찾기 위함
// 두번째 e를 찾알(우선, 첫번째를 찾아라)
		int h3 = h1.indexOf('e'); // 4
		System.out.println(h3);
		int h4 = h1.indexOf('e', h3 + 1);
		System.out.println(h4);
// lastIndexOf(int ch), lastIndexOf(String str) : int
		int h5 = h1.lastIndexOf('e');
		System.out.println(h5);

// length() : int
// 문자열 길이 구하기 (1부터시작)

		String str1 = "Hello";
		System.out.println(str1.length());

//replace (char oldChar. char newChar) : String
//replace (CharSequence target, CharSequence replacement) :String
//지금은 replace(String oldString, String newString): String:String
//새로운 문자열 받아서 치환한다

		String str2 = "대한민국";
		String str3 = str2.replace('민', '民');
		System.out.println(str3);

		String str4 = str2.replace("민", "민★");
		System.out.println(str4);

//isEmpty() :boolean
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());
		String str6 = "";
		System.out.println(str6.isEmpty());
//String str7= null;
//System.out.println(str7.isEmpty()); //-> err

//split(String regex) :String[]
//split(String regex, int limit) :String[]

// substring(int beginIndex) : String
// 입력된 시작위치부터 끝까지 문자열 추출
// substring(int beginIndex, int endIndex) : String
// 입력된 시작위치부터 입력되 ㄴ끝위치 전까지 문자열 추출(끝위ㅣ치 포함안함)\\
//endIndex - beginIndex = 추출할 문자의 갯수

		String t1 = "010-3958-2948";
		String t2 = t1.substring(4);
		System.out.println("substring(4)" + t2);

		t2 = t1.substring(9);
		System.out.println(t2);

		t2 = t1.substring(t1.lastIndexOf('-') + 1);
		System.out.println(t2);

		String t3 = t1.substring(4, 8);
		System.out.println(t3);

//010-7777-9999 => 010-7777-****, 010-****-9999

		String t5 = "****";
		System.out.println(t1.replace(t1.substring(9), t5));

// toLowerCase(), toUppercase()
		String t6 = "abfcdAGERH";
		System.out.println(t6.toLowerCase());
		System.out.println(t6.toUpperCase());
//String -toString 문자열자체 반환
		String t7 = "java 17 자바 17";
		String t8 = t7.toString();
		System.out.println(t8);

//trim(): String
//해당 문자열의 앞뒤 공백제거, 중간공백은제거안함
		String t9 = "   java 자바 JAVA";
		String t10 = t9.trim();

//startWith(String prefix) : boolean => 주어진문자열로 시작하는지?
//startWith(String prefix, int offset-시작위치) :boolean =
		boolean b1 = t10.startsWith("java"); // true
		System.out.println(b1);
		boolean b2 = t10.startsWith("JAVA"); // false
		System.out.println(b2);
		boolean b3 = t10.startsWith("자바", 5); // false
		System.out.println(b2);

//valueOf : static String
//어떤 기본자료형이든지  string 으로 변경시킴
		boolean bo1 = true;
		char ch1 = 'c';
		int num1 = 32;
		long num2 = 37L;
		float num3 = 3.15394f;
		double num4 = 4854.1445;

// 자료형 +1
		System.out.println(bo1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		System.out.println((char) (ch1 + 1));
		System.out.println(String.valueOf(bo1));
//////////////////////////////////////////////
		System.out.println("string.valueOf");
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		System.out.println(String.valueOf(ch1) + 1);
////////////////////////////////////////
		System.out.println(bo1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");
		System.out.println(ch1 + "1");

//Wrapper class
//기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
//기본 자료형을 객체로 만들때 사용하는 클래스
//"true" "false" 문자열을 기본자료형인 불린형으로 변경 : Boolean.parseBoolean(String)
		String msg = " true";
		boolean msg2 = Boolean.parseBoolean(msg);// "true" -> true
		System.out.println(msg + 1);
		msg2 = Boolean.parseBoolean("가나다");
		System.out.println(msg2);

//		"10" "124" 문자열을 기본자료형인 int 형으로 변경
//		Integer.parseInt(String)
		msg = "124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(msg3 + 10);
		
		//문자열을 기본자료형인 long변경 : long.parseLong()
		msg = "12848938129";
		long msg4 =12848938129L;
		//int 범위벗어나서 L붙임
		long msg5 = Long.parseLong(msg);
				System.out.println(msg5+1);
				
				//Float.parseFloat()
msg="32.13f";
float msg6 = Float.parseFloat(msg);
System.out.println(msg6 + 10);

//Double.parseDouble()
msg ="3.17890";
double msg7 = Double.parseDouble(msg);
System.out.println(msg7+10);

msg="A";
char msg8 =msg.charAt(0);
System.out.println(msg+1);
System.out.println(msg8+1);
System.out.println((char)(msg8+1));
	}
}
