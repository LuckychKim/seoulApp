package com.appvengers.seoulapp.domain.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDao extends JpaRepository<Common, CommonPK>, CommonCustomDao {

}
