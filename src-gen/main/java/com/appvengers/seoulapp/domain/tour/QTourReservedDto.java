package com.appvengers.seoulapp.domain.tour;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTourReservedDto is a Querydsl query type for TourReservedDto
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QTourReservedDto extends BeanPath<TourReservedDto> {

    private static final long serialVersionUID = 739338550L;

    public static final QTourReservedDto tourReservedDto = new QTourReservedDto("tourReservedDto");

    public final QTour _super = new QTour(this);

    //inherited
    public final StringPath acntNm = _super.acntNm;

    //inherited
    public final StringPath addr = _super.addr;

    //inherited
    public final StringPath addrRepresent = _super.addrRepresent;

    //inherited
    public final StringPath bankCd = _super.bankCd;

    //inherited
    public final StringPath bankNo = _super.bankNo;

    public final StringPath confYn = createString("confYn");

    //inherited
    public final StringPath endDt = _super.endDt;

    //inherited
    public final StringPath finishTm = _super.finishTm;

    //inherited
    public final NumberPath<Long> latitude = _super.latitude;

    //inherited
    public final StringPath leadTm = _super.leadTm;

    //inherited
    public final NumberPath<Long> longitude = _super.longitude;

    //inherited
    public final NumberPath<Integer> maxNum = _super.maxNum;

    //inherited
    public final StringPath meetTm = _super.meetTm;

    //inherited
    public final NumberPath<Integer> minNum = _super.minNum;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final DateTimePath<java.util.Date> regDt = _super.regDt;

    //inherited
    public final StringPath startDt = _super.startDt;

    //inherited
    public final StringPath subTitle = _super.subTitle;

    //inherited
    public final StringPath tel = _super.tel;

    //inherited
    public final StringPath title = _super.title;

    //inherited
    public final StringPath tourCont = _super.tourCont;

    //inherited
    public final NumberPath<Integer> tourId = _super.tourId;

    //inherited
    public final StringPath tourImg = _super.tourImg;

    //inherited
    public final DateTimePath<java.util.Date> updDt = _super.updDt;

    //inherited
    public final StringPath userId = _super.userId;

    public QTourReservedDto(String variable) {
        super(TourReservedDto.class, forVariable(variable));
    }

    public QTourReservedDto(Path<? extends TourReservedDto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTourReservedDto(PathMetadata metadata) {
        super(TourReservedDto.class, metadata);
    }

}

