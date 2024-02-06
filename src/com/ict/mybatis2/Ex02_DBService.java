package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex02_DBService {
	static private SqlSessionFactory factory;
	static String rsc = "com/ict/mybatis2/ex02_config.xml";
	static {
		try {
			InputStream in = Resources.getResourceAsStream(rsc);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
