package com.appvengers.seoulapp.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appvengers.seoulapp.test.domain.Emp;
import com.appvengers.seoulapp.test.domain.EmpPK;

public interface MultiPKDao extends JpaRepository<Emp, EmpPK>{

}
