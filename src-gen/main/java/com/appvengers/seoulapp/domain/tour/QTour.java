package com.appvengers.seoulapp.domain.tour;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTour is a Querydsl query type for Tour
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTour extends EntityPathBase<Tour> {

    private static final long serialVersionUID = 156660129L;

    public static final QTour tour = new QTour("tour");

    public final StringPath acntNm = createString("acntNm");

    public final StringPath addr = createString("addr");

    public final StringPath addrRepresent = createString("addrRepresent");

    public final StringPath bankCd = createString("bankCd");

    public final StringPath bankNo = createString("bankNo");

    public final StringPath endDt = createString("endDt");

    public final StringPath finishTm = createString("finishTm");

    public final NumberPath<Long> latitude = createNumber("latitude", Long.class);

    public final StringPath leadTm = createString("leadTm");

    public final NumberPath<Long> longitude = createNumber("longitude", Long.class);

    public final NumberPath<Integer> maxNum = createNumber("maxNum", Integer.class);

    public final StringPath meetTm = createString("meetTm");

    public final NumberPath<Integer> minNum = createNumber("minNum", Integer.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final DateTimePath<java.util.Date> regDt = createDateTime("regDt", java.util.Date.class);

    public final StringPath startDt = createString("startDt");

    public final StringPath subTitle = createString("subTitle");

    public final StringPath tel = createString("tel");

    public final StringPath title = createString("title");

    public final StringPath tourCont = createString("tourCont");

    public final NumberPath<Integer> tourId = createNumber("tourId", Integer.class);

    public final StringPath tourImg = createString("tourImg");

    public final DateTimePath<java.util.Date> updDt = createDateTime("updDt", java.util.Date.class);

    public final StringPath userId = createString("userId");

    public QTour(String variable) {
        super(Tour.class, forVariable(variable));
    }

    public QTour(Path<? extends Tour> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTour(PathMetadata metadata) {
        super(Tour.class, metadata);
    }

}

