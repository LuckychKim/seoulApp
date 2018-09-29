package com.appvengers.seoulapp.domain.user;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.domain.common.QCommon;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;

@Repository
public class UserCustomDaoImpl extends QuerydslRepositorySupport implements UserCustomDao {

	@PersistenceContext
	EntityManager em;
	
	public UserCustomDaoImpl() {
		super(User.class);
	}

	@Override
	public boolean updateUser(User user) {
		QUser qUser = QUser.user;
		Date now = new Date();
		
		JPAUpdateClause updateClause = new JPAUpdateClause(em, qUser);
		
		if(user.getUserName() != null) {
			updateClause.set(qUser.userName, user.getUserName());
		}
		if(user.getUserImg() != null) {
			updateClause.set(qUser.userImg, user.getUserImg());
		}
				
		updateClause.set(qUser.regDt, now)
				.where(qUser.userId.eq(user.getUserId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0;
	}
	
	@Override
	public List<LoginInfo> findAllLoginInfoByUserId(User pUser) {
		QUser user = QUser.user;
		QUserDetail userDetail = QUserDetail.userDetail;
		QCommon common = QCommon.common;
		
		JPQLQuery<LoginInfo> query = from(user)
				.innerJoin(userDetail)
				.on(user.userId.eq(userDetail.userId))
				.innerJoin(common)
				.on(common.comCd.eq(userDetail.cateId))
				.select(Projections.constructor(LoginInfo.class, 
						user.userId,
						user.userName,
						user.userImg,
						userDetail.cateId,
						common.comName))
				.where(user.userId.eq(pUser.getUserId()))
				.where(common.groupCd.eq("TASTES"));
		
		return query.fetch();
	}

}
