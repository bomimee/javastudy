package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

// List Interface : 배열과 흡사한 구조, 삽입, 삭제, 추가 자유롭다
/* 크기를 미리 지정하지 않아도 된다.
 * 구현한 클래스: Stack, Vector, ArrayList
 * 구조 - LIFO Last in first out
 * add, push, addElement 중복가능
 * add(index, E)  중복가능
 * pop : 맨위에 존재하는 객체 반환후 삭제
 * peek : 맨위에 존재하는 객체 반환. 
 * contains(Element e): boolean 
  * search 검색 오른쪽 1부터
 * indexOf: 검색 왼쪽 0 부터 => 배열형식처럼
 * elementAt(index) : 해당요소 반환
 * get(index) : 해당요소반환
 * firstElement()
 * lastElement()
 * setElement(Elementm, index)
* 
* Queue interface ; fifo first in first out
* 구현한 클래스: LinkedList (더 많다 그중 하나)
*            멀티스레드 동기화 안됨
*            add, addFirst, addLast, offer, offerFirst, offerLast
*/
public class Ex01 {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");

		s1.add(1, "고길동");
		s1.add(3, "희동이");
		System.out.println(s1);

		// 마지막객체보기: pop peek, lastElement
		String res = s1.peek();
		System.out.println(res);
		System.out.println(s1);
		res = s1.pop();
		System.out.println(res);
		System.out.println(s1);
		res = s1.lastElement();
		System.out.println(res);
		System.out.println(s1);

		if (s1.contains("둘리")) {
			// 위치값검색
			System.out.println(s1.indexOf("둘리"));
			System.out.println(s1.search("둘리"));
			// 위치값이용해서 element 찾기
			System.out.println(s1.get(1));
			System.out.println(s1.elementAt(1));
			// 처음 마지막요소 반환
			System.out.println(s1.firstElement());
			System.out.println(s1.lastElement());
		} else {
			System.out.println("not exist");
		}
		// 고길동 도우너로 변경
		if (s1.contains("고길동")) {

			s1.setElementAt("도우너", s1.indexOf("고길동"));
		}
		System.out.println(s1);
		System.out.println(s1.size());

		// 하나씩꺼내기
		for (String k : s1) {
			System.out.println(k + "님");
		}

		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + "짱");
		}System.out.println();
		
		// 하나씩거낸다
		while (!s1.isEmpty()) {
			String k = s1.pop();
			System.out.println(k + ", 크기" + s1.size());
		}
	} 
}
