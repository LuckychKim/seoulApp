package com.appvengers.seoulapp.domain.review;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -407221599L;

    public static final QReview review = new QReview("review");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath reviewCont = createString("reviewCont");

    public final NumberPath<Integer> reviewId = createNumber("reviewId", Integer.class);

    public final StringPath score = createString("score");

    public final NumberPath<Integer> tourId = createNumber("tourId", Integer.class);

    public final DatePath<java.time.LocalDate> updDt = createDate("updDt", java.time.LocalDate.class);

    public final StringPath userId = createString("userId");

    public QReview(String variable) {
        super(Review.class, forVariable(variable));
    }

    public QReview(Path<? extends Review> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReview(PathMetadata metadata) {
        super(Review.class, metadata);
    }

}

