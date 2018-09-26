package com.appvengers.seoulapp.domain.course;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = -242583231L;

    public static final QCourse course = new QCourse("course");

    public final StringPath courseCont = createString("courseCont");

    public final StringPath courseId = createString("courseId");

    public final StringPath courseImg1 = createString("courseImg1");

    public final StringPath courseImg2 = createString("courseImg2");

    public final StringPath courseImg3 = createString("courseImg3");

    public final StringPath courseName = createString("courseName");

    public final StringPath endTm = createString("endTm");

    public final StringPath infoId = createString("infoId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath startTm = createString("startTm");

    public final StringPath tourId = createString("tourId");

    public final DatePath<java.time.LocalDate> updDt = createDate("updDt", java.time.LocalDate.class);

    public QCourse(String variable) {
        super(Course.class, forVariable(variable));
    }

    public QCourse(Path<? extends Course> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourse(PathMetadata metadata) {
        super(Course.class, metadata);
    }

}

