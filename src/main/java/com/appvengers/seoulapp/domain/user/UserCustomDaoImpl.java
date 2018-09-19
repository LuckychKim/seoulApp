package com.appvengers.seoulapp.domain.user;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.domain.common.QCommon;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

@Repository
public class UserCustomDaoImpl extends QuerydslRepositorySupport implements UserCustomDao {

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
