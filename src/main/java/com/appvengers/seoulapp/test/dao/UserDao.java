package com.appvengers.seoulapp.test.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.controller.UserController;

@Repository
public class UserDao {
	@Autowired
	SqlSessionFactory sqlsessionFactory;
	private static final Logger LOGGER = LoggerFactory.getLogger( UserDao.class );
	
	
	public List<LinkedHashMap<String, Object>> login(Map userProfile){
		SqlSession sqlSession = sqlsessionFactory.openSession();
		try {
			LOGGER.debug("LoginDao Start");
			List<LinkedHashMap<String, Object>> list = sqlSession.selectList("seoulapp.test.TestDao.testSelect", userProfile);
			System.out.println("abc");
			return list;
		}finally {
			sqlSession.close();
		}
	}

}
