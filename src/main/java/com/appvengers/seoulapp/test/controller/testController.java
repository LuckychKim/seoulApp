package com.appvengers.seoulapp.test.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.common.config.PersistenceConfig;
import com.appvengers.seoulapp.test.dao.MultiPKDao;
import com.appvengers.seoulapp.test.dao.TestDao;
import com.appvengers.seoulapp.test.domain.Emp;
import com.appvengers.seoulapp.test.domain.EmpPK;
import com.appvengers.seoulapp.test.domain.Test;

@RestController
public class testController {

	private static final Logger LOGGER = LoggerFactory.getLogger( testController.class );
	
	@Autowired
	TestDao testDao;
	
	@Autowired
	MultiPKDao multiPkDao;
	
	@Autowired
	PersistenceConfig psConfig;
	
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
		EntityManager em = psConfig.getEntityManager();
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
