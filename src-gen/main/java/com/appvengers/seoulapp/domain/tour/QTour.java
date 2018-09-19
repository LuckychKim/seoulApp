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

    public final StringPath bankCd = createString("bankCd");

    public final StringPath bankNm = createString("bankNm");

    public final StringPath endDt = createString("endDt");

    public final NumberPath<Long> latitude = createNumber("latitude", Long.class);

    public final DatePath<java.time.LocalDate> leadTm = createDate("leadTm", java.time.LocalDate.class);

    public final NumberPath<Long> longitude = createNumber("longitude", Long.class);

    public final NumberPath<Integer> maxNum = createNumber("maxNum", Integer.class);

    public final DatePath<java.time.LocalDate> meetTm = createDate("meetTm", java.time.LocalDate.class);

    public final NumberPath<Integer> minNum = createNumber("minNum", Integer.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath startDt = createString("startDt");

    public final StringPath subTitle = createString("subTitle");

    public final StringPath tel = createString("tel");

    public final StringPath title = createString("title");

    public final StringPath tourCont = createString("tourCont");

    public final StringPath tourId = createString("tourId");

    public final StringPath tourImg = createString("tourImg");

    public final DatePath<java.time.LocalDate> updDt = createDate("updDt", java.time.LocalDate.class);

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
