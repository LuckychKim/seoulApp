package com.appvengers.seoulapp.test.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmpPK is a Querydsl query type for EmpPK
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QEmpPK extends BeanPath<EmpPK> {

    private static final long serialVersionUID = 1194346616L;

    public static final QEmpPK empPK = new QEmpPK("empPK");

    public final StringPath empName = createString("empName");

    public final StringPath empNo = createString("empNo");

    public QEmpPK(String variable) {
        super(EmpPK.class, forVariable(variable));
    }

    public QEmpPK(Path<? extends EmpPK> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmpPK(PathMetadata metadata) {
        super(EmpPK.class, metadata);
    }

}

