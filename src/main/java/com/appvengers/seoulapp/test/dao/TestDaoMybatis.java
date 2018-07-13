package com.appvengers.seoulapp.test.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoMybatis {
	@Autowired
	SqlSessionFactory sqlsessionFactory;
	
	public List<LinkedHashMap<String, Object>> testMethod(){
		SqlSession sqlSession = sqlsessionFactory.openSession();
		try {
			System.out.println("TestDao Start");
			HashMap<String, Object> param = new HashMap<>();
			List<LinkedHashMap<String, Object>> list = sqlSession.selectList("seoulapp.test.TestDao.testSelect", param);
			System.out.println("abc");
			return list;
		}finally {
			sqlSession.close();
		}
	}
}
