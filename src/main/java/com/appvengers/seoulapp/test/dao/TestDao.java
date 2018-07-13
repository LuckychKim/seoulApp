package com.appvengers.seoulapp.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appvengers.seoulapp.test.domain.Test;

public interface TestDao extends JpaRepository<Test, Integer> {
	
}
