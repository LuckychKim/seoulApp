package com.appvengers.seoulapp.domain.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer>, UserCustomDao{
	
	Optional<User> findByUserName(String name);
}
