package com.appvengers.seoulapp.domain.review;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReviewDto is a Querydsl query type for ReviewDto
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QReviewDto extends BeanPath<ReviewDto> {

    private static final long serialVersionUID = 1744024446L;

    public static final QReviewDto reviewDto = new QReviewDto("reviewDto");

    public final QReview _super = new QReview(this);

    //inherited
    public final DateTimePath<java.util.Date> regDt = _super.regDt;

    //inherited
    public final StringPath reviewCont = _super.reviewCont;

    //inherited
    public final NumberPath<Integer> reviewId = _super.reviewId;

    //inherited
    public final StringPath score = _super.score;

    //inherited
    public final NumberPath<Integer> tourId = _super.tourId;

    //inherited
    public final DateTimePath<java.util.Date> updDt = _super.updDt;

    //inherited
    public final StringPath userId = _super.userId;

    public final StringPath userImg = createString("userImg");

    public final StringPath userName = createString("userName");

    public QReviewDto(String variable) {
        super(ReviewDto.class, forVariable(variable));
    }

    public QReviewDto(Path<? extends ReviewDto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReviewDto(PathMetadata metadata) {
        super(ReviewDto.class, metadata);
    }

}

