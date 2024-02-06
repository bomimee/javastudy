package com.ict.day15;

public class Ex01 {
/*
 *  제네릭과 컬랙션 (자료구조)
 *  제네릭 - 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입
 *  컬렉션 - 객체들을 모아서 저장관리하는 인터페이스들을 말한다
 *  변수 => 하나의 데이터를 데이터를 저장할수있는 영역
 *  배열 => 같은 종류의 자료형을 저장
 *         크기를 먼저 지정해야 한다. 변경이 안된다.
 *         변수와 객체를 여러개를 저장할 수 있다. 
 *  클래스 - 배열은 같은 종류의 자료형을 저장하는 것이 불편해서 클래스에 저장하면 다양한 종류의 데이터 저장
 *  컬랙션 - 다양한 종류의 데이터를 저장한 클래스를 하나의 객체로 마들고 그 객체를 컬렉션에 저장 후 관리할수있는 인터페이스 
 *  형식) 컬렉션 <제네닉>
 *  API : <T> => Type, <E> => Element , 컬렉션안에 존재하는 객체 하나하나를 뜻한다
 *  맵형식 Map<K,V> => key, value
 *  1:1 대응, ** key 호출하면 value 나옴
 *  최상위 컬렉션 Collection<E>, Map<K,V>
 *  Collection<E> 를 상속받아서 인터페이스들 ; Set<E>, List<E>, Queue<E>
 *  
 *  Collection의 주요 method
 *  add(E e): boolean => 해당컬렉션에 인자로 받은 요소를 추가, 성공하면 트루, 틀리면 폴스
 *  addAll(Collection<? extends E> c): boolean 
 *  => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가 
 *  clear() : void => 모든 요소 제거
 *  contains(Object o) : boolean 
 *  isEmpty() : boolean
 *  remove(Object o) : boolean  = remove o 성공하면 true
 *  size() : int = > Element 수
 *  toArray() : Object[] => 컬렉션을 배열로 만들어준다
 *         <-> Arrays.asList() 배열을 컬렉션으로 만들어준다 
 *         
 *  iterator() 메서드; Iterator<E> 클래스 => 컬렉션안에 존재하는 객체들을 순서대로 접근하기 위해서 Iterator 객체로 반환
 *                                           객체를 하나씩 꺼내서 작업할때 사용
 *  
 *  
 */
}
