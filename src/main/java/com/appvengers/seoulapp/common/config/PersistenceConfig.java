package com.appvengers.seoulapp.common.config;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class PersistenceConfig {

	private EntityManagerFactory emFactory;
	
	@PostConstruct
	private void init() {
		emFactory = Persistence.createEntityManagerFactory("persistence-unit");
	}
	
	public EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
}
