package com.appvengers.seoulapp.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserDetail is a Querydsl query type for UserDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserDetail extends EntityPathBase<UserDetail> {

    private static final long serialVersionUID = 1342341426L;

    public static final QUserDetail userDetail = new QUserDetail("userDetail");

    public final StringPath cateId = createString("cateId");

    public final StringPath userId = createString("userId");

    public QUserDetail(String variable) {
        super(UserDetail.class, forVariable(variable));
    }

    public QUserDetail(Path<? extends UserDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDetail(PathMetadata metadata) {
        super(UserDetail.class, metadata);
    }

}

