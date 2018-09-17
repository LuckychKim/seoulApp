package com.appvengers.seoulapp.domain.user;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.appvengers.seoulapp.domain.common.QCommon;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

public class UserCustomDaoImpl extends QuerydslRepositorySupport implements UserCustomDao {

//	@PersistenceContext
//	private EntityManager entityManager;
	
	public UserCustomDaoImpl() {
		super(User.class);
	}

	@Override
	public List<User> findAllUserByUserName() {
		QUser user = QUser.user;
		
		return from(user)
				.where(user.userName.eq("Á¶¿øÁø"))
				.fetch();
	}

	@Override
	public List<String> findAllUserName() {
		QUser user = QUser.user;
		return from(user)
				.select(user.userName)
				.fetch();
	}

	@Override
	public List<LoginInfo> findAllUser() {
		QUser user = QUser.user;
		QUserDetail userDetail = QUserDetail.userDetail;
		QCommon common = QCommon.common;
		
		JPQLQuery<LoginInfo> query = from(user)
				.innerJoin(userDetail)
				.on(user.userId.eq(userDetail.userId))
				.select(Projections.constructor(LoginInfo.class, 
						user.userId,
						user.userName,
						user.userImg,
						userDetail.cateId))
				.where(user.userId.eq(userDetail.userId));
		
		return query.fetch();
	}

}
