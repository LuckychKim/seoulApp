package com.appvengers.seoulapp.test.controller;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.test.dao.MultiPKDao;
import com.appvengers.seoulapp.test.dao.TestDao;
import com.appvengers.seoulapp.test.dao.TestDaoMybatis;
import com.appvengers.seoulapp.test.domain.Emp;
import com.appvengers.seoulapp.test.domain.EmpPK;
import com.appvengers.seoulapp.test.domain.Test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

@RestController
public class testController {

	private static final Logger LOGGER = LoggerFactory.getLogger( testController.class );
	
	@Autowired
	TestDao testDao;
	
	@Autowired
	TestDaoMybatis testDaoMyabtis;
	
	@Autowired
	MultiPKDao multiPkDao;
	
	//@Autowired
	//PersistenceConfig psConfig;
	
	@RequestMapping("/test/testMethod")
	public boolean testMethod(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 1. 함수 호출 및 입력 param 분석
			BufferedReader bf = request.getReader();
			if(bf == null){
				System.out.println("buffer = null");
				return false;
			}
			
			///Object obj = JSONValue.parse(bf);t
			JSONObject jobj = (JSONObject)JSONValue.parse(bf);
			if(jobj != null)
			{
				Iterator it = jobj.keySet().iterator();
				while(it.hasNext())
				{
					String key = (String) it.next();
					System.out.println("key : " + key);
				}
			}
			
			//2. Data 가져오기
			List resultList = testDaoMyabtis.testMethod();
			
			//3. 결과 값
			JSONObject json = new JSONObject();
			String result = "success";
			JSONArray dataTable = new JSONArray();
			for(int i = 0; i < resultList.size(); i++)
			{
				JSONObject dataRow = new JSONObject();
				LinkedHashMap<String, Object> row = (LinkedHashMap<String, Object>) resultList.get(i);
				for(String key : row.keySet()){
					dataRow.put(key, row.get(key));
				}
				dataTable.add(dataRow);
			}
			json.put("dataTable", dataTable);
			json.put("result", "success");
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			//response.getWriter().write(json.toString());
			response.getOutputStream().print(json.toString());
			//response.getOutputStream().
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	
	@PostMapping( "/test/mapping" )
	public boolean testMapping( int seq, String test ) {
		
		LOGGER.debug(seq + " : " + test);
		
		testDao.save(new Test(test));
		
		List<Test> testList = testDao.findAll();
		
		for(Test t : testList) {
			LOGGER.debug("seq : " + t.getSeq() + ", test : " + t.getTest());
		}
		
		return true;
	}
	
/*	create table emp (
	    emp_no integer not null,
	    emp_name varchar(25) not null,
	    phone varchar(25),
	    primary key (emp_no, emp_name)
	)*/
	@PostMapping( "/test/multiPK" )
	public boolean multiPKMapping() {
		EntityManager em = null;//psConfig.getEntityManager();
		em.getTransaction().begin();
		EmpPK empPk = new EmpPK();
		
		empPk.setEmpNo("1");
		empPk.setEmpName("kim");
		
		Emp emp = new Emp();
		
		emp.setEmpPK(empPk);
		emp.setPhone("010-0000-1111");
		
		em.persist(emp);
		
		Emp result = em.find(Emp.class, empPk);
		
		LOGGER.debug("emp_no : " + result.getEmpPK().getEmpNo() + ", emp_name : " + 
				result.getEmpPK().getEmpName() + ", emp_phone : " + result.getPhone());
		
//		em.close();
		em.getTransaction().commit();
		em.clear();
		return true;
	}
}
