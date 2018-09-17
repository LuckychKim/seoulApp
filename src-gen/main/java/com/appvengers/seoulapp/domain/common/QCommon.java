package com.appvengers.seoulapp.domain.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommon is a Querydsl query type for Common
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCommon extends BeanPath<Common> {

    private static final long serialVersionUID = -624242879L;

    public static final QCommon common = new QCommon("common");

    public final StringPath comCd = createString("comCd");

    public final StringPath comName = createString("comName");

    public final StringPath groupCd = createString("groupCd");

    public final StringPath groupName = createString("groupName");

    public QCommon(String variable) {
        super(Common.class, forVariable(variable));
    }

    public QCommon(Path<? extends Common> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommon(PathMetadata metadata) {
        super(Common.class, metadata);
    }

}

