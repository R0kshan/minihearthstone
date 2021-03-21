package minihearthstone.entities.match;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMatchId is a Querydsl query type for MatchId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QMatchId extends BeanPath<MatchId> {

    private static final long serialVersionUID = 1779293996L;

    public static final QMatchId matchId = new QMatchId("matchId");

    public final StringPath p1ClientId = createString("p1ClientId");

    public final StringPath p2ClientId = createString("p2ClientId");

    public QMatchId(String variable) {
        super(MatchId.class, forVariable(variable));
    }

    public QMatchId(Path<? extends MatchId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMatchId(PathMetadata metadata) {
        super(MatchId.class, metadata);
    }

}

