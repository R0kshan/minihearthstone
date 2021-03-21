package minihearthstone.entities.cards.effects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBasicEffect is a Querydsl query type for BasicEffect
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBasicEffect extends EntityPathBase<BasicEffect> {

    private static final long serialVersionUID = 1329817213L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBasicEffect basicEffect = new QBasicEffect("basicEffect");

    public final QAbstractEffect _super;

    // inherited
    public final minihearthstone.entities.cards.QCard effectMapping;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    public QBasicEffect(String variable) {
        this(BasicEffect.class, forVariable(variable), INITS);
    }

    public QBasicEffect(Path<? extends BasicEffect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBasicEffect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBasicEffect(PathMetadata metadata, PathInits inits) {
        this(BasicEffect.class, metadata, inits);
    }

    public QBasicEffect(Class<? extends BasicEffect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QAbstractEffect(type, metadata, inits);
        this.effectMapping = _super.effectMapping;
        this.id = _super.id;
        this.name = _super.name;
    }

}

