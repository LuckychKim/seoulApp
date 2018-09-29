package com.appvengers.seoulapp.domain.tour;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTourDetail is a Querydsl query type for TourDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTourDetail extends EntityPathBase<TourDetail> {

    private static final long serialVersionUID = -1885865646L;

    public static final QTourDetail tourDetail = new QTourDetail("tourDetail");

    public final StringPath comCd = createString("comCd");

    public final NumberPath<Integer> tourId = createNumber("tourId", Integer.class);

    public QTourDetail(String variable) {
        super(TourDetail.class, forVariable(variable));
    }

    public QTourDetail(Path<? extends TourDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTourDetail(PathMetadata metadata) {
        super(TourDetail.class, metadata);
    }

}

