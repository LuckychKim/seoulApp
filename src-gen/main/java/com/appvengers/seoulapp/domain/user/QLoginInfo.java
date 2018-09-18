package com.appvengers.seoulapp.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLoginInfo is a Querydsl query type for LoginInfo
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QLoginInfo extends BeanPath<LoginInfo> {

    private static final long serialVersionUID = -743532607L;

    public static final QLoginInfo loginInfo = new QLoginInfo("loginInfo");

    public final StringPath cateId = createString("cateId");

    public final StringPath comName = createString("comName");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> updDt = createDate("updDt", java.time.LocalDate.class);

    public final StringPath userId = createString("userId");

    public final StringPath userImg = createString("userImg");

    public final StringPath userName = createString("userName");

    public QLoginInfo(String variable) {
        super(LoginInfo.class, forVariable(variable));
    }

    public QLoginInfo(Path<? extends LoginInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoginInfo(PathMetadata metadata) {
        super(LoginInfo.class, metadata);
    }

}

