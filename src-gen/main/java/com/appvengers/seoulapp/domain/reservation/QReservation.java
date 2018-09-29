package com.appvengers.seoulapp.domain.reservation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = -1033546595L;

    public static final QReservation reservation = new QReservation("reservation");

    public final NumberPath<Integer> bookId = createNumber("bookId", Integer.class);

    public final StringPath confYn = createString("confYn");

    public final DateTimePath<java.util.Date> regDt = createDateTime("regDt", java.util.Date.class);

    public final NumberPath<Integer> tourId = createNumber("tourId", Integer.class);

    public final DateTimePath<java.util.Date> updDt = createDateTime("updDt", java.util.Date.class);

    public final StringPath userId = createString("userId");

    public QReservation(String variable) {
        super(Reservation.class, forVariable(variable));
    }

    public QReservation(Path<? extends Reservation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReservation(PathMetadata metadata) {
        super(Reservation.class, metadata);
    }

}

