package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

//DB 처리하는 메서드를 가진 클래스 
public class Ex01_DAO {
	// 마이바티스에서 실제 사용하는 클래스는 sqlSession
	private static SqlSession ss;

	// 싱글턴패턴 (동기화처리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = Ex01_DBService.getFactory().openSession();// 수동커밋

		}
		return ss;
	}

// handling DB methods => call mapper.xml
	// to see entire table => several result => List<VO>, no parameter
	public static List<Ex01_VO> getList() {
		List<Ex01_VO> list = null;
//		getSession().selectList("mapper.xml's name.id") 
		list = getSession().selectList("customer.getSelectAll");
		return list; // commit 하기 위해서 변수를 만든다 , 셀렉트는 커밋이 필요없기때문에 바로 리턴해도 된다.
	}

	// to see just one result - > VO or int / String like primary variables
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;

	}

	public static int getCnt() {
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}

	// insert, update, delete -> always result int! and for sure to do commit
	public static int getIns(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("customer.getInsert", vo);
		if (result > 0)
			ss.commit();
		return result;
	}

	public static int getDelete(Ex01_VO vo) {
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		if (result > 0)
			ss.commit();
		return result;
	}

	public static int getUpdate(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("customer.getUpdate", vo);
		if (result > 0)
			ss.commit();
		return result;
	}

}
