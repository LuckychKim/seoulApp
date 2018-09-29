package com.appvengers.seoulapp.domain.common;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

@Repository
public class CommonCustomDaoImpl extends QuerydslRepositorySupport implements CommonCustomDao{

	public CommonCustomDaoImpl() {
		super(Common.class);
	}

	@Override
	public List<Common> retrieveBankList() {
		QCommon common = QCommon.common;
		
		JPQLQuery<Common> query = from(common)
				.select(Projections.constructor(Common.class, 
						common.comCd,
						common.comName,
						common.groupCd,
						common.groupName
						))
				.where(common.groupCd.eq("BANKCD"));
		return query.fetch();
	}

	@Override
	public List<Common> retrieveTasteList() {
		QCommon common = QCommon.common;
		
		JPQLQuery<Common> query = from(common)
				.select(Projections.constructor(Common.class, 
						common.comCd,
						common.comName,
						common.groupCd,
						common.groupName
						))
				.where(common.groupCd.eq("TASTES"));
		return query.fetch();
	}

}
