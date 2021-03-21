package minihearthstone.entities.cards.effects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAbstractEffect is a Querydsl query type for AbstractEffect
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAbstractEffect extends EntityPathBase<AbstractEffect> {

    private static final long serialVersionUID = 1697935477L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAbstractEffect abstractEffect = new QAbstractEffect("abstractEffect");

    public final minihearthstone.entities.cards.QCard effectMapping;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QAbstractEffect(String variable) {
        this(AbstractEffect.class, forVariable(variable), INITS);
    }

    public QAbstractEffect(Path<? extends AbstractEffect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAbstractEffect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAbstractEffect(PathMetadata metadata, PathInits inits) {
        this(AbstractEffect.class, metadata, inits);
    }

    public QAbstractEffect(Class<? extends AbstractEffect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.effectMapping = inits.isInitialized("effectMapping") ? new minihearthstone.entities.cards.QCard(forProperty("effectMapping"), inits.get("effectMapping")) : null;
    }

}

