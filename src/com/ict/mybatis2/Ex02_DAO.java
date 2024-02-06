package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex02_DAO {

	private static SqlSession ss;

	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = Ex02_DBService.getFactory().openSession();
		}
		return ss;
	}

	public static List<Ex02_VO> getList() {
		List<Ex02_VO> list = null;
		list = getSession().selectList("members.selectAll");
		return list;
		
//		  try (SqlSession sqlSession = Ex02_DBService.getFactory().openSession()) {
//	            return sqlSession.selectList("members.selectAll");
//	        }
	}

	public static Ex02_VO getOne(String idx) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("members.selectOne", idx);
		return vo;
	}

	public static int getInsert(Ex02_VO vo) {
		int res = 0;
		res = getSession().insert("members.getInsert", vo);
		if (res > 0)
			ss.commit();

		return res;
	}

	public static int getDelete(Ex02_VO vo) {
		int res = 0;
		res = getSession().delete("members.getDelete", vo);
		if (res > 0)
			ss.commit();

		return res;
	}

	public static int getUpdate(Ex02_VO vo) {
		int res = 0;
		res = getSession().update("members.getUpdate", vo);
		if (res > 0)
			ss.commit();

		return res;
	}
	public static Ex02_VO getLogin(Ex02_VO vo) {
		Ex02_VO vo1 = null;
		vo1 = getSession().selectOne("members.login", vo1);
		//pw 를 얻어내자 (db 에 암호화가 되어있다)
		
		//아이디가 없으면 null => return null
	if(vo!= null) {
		String pw = vo.getPw();
		
		//우리가 입력한 pw 암호화하자 
		// string s_pw =vo.getPw().암호화메서드 사용
		
		//db에서 꺼낸 암호와 암호화된 암호 비교
		//이것이 트루면 성공
		boolean les = true;
		if(les) {
			return vo;
			
		}else { return null;}
		
	}else {
		return null;
	}
	}
}
