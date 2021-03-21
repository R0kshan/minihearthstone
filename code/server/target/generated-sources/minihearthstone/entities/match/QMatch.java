package minihearthstone.entities.match;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMatch is a Querydsl query type for Match
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMatch extends EntityPathBase<Match> {

    private static final long serialVersionUID = 649895473L;

    public static final QMatch match = new QMatch("match");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath p1Answer = createString("p1Answer");

    public final StringPath p1ClientId = createString("p1ClientId");

    public final StringPath p2Answer = createString("p2Answer");

    public final StringPath p2ClientId = createString("p2ClientId");

    public QMatch(String variable) {
        super(Match.class, forVariable(variable));
    }

    public QMatch(Path<? extends Match> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMatch(PathMetadata metadata) {
        super(Match.class, metadata);
    }

}

