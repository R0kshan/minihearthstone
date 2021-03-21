package minihearthstone.entities.cards.effects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLifeStealEffect is a Querydsl query type for LifeStealEffect
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLifeStealEffect extends EntityPathBase<LifeStealEffect> {

    private static final long serialVersionUID = 505383746L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLifeStealEffect lifeStealEffect = new QLifeStealEffect("lifeStealEffect");

    public final QAbstractEffect _super;

    // inherited
    public final minihearthstone.entities.cards.QCard effectMapping;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    public QLifeStealEffect(String variable) {
        this(LifeStealEffect.class, forVariable(variable), INITS);
    }

    public QLifeStealEffect(Path<? extends LifeStealEffect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLifeStealEffect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLifeStealEffect(PathMetadata metadata, PathInits inits) {
        this(LifeStealEffect.class, metadata, inits);
    }

    public QLifeStealEffect(Class<? extends LifeStealEffect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QAbstractEffect(type, metadata, inits);
        this.effectMapping = _super.effectMapping;
        this.id = _super.id;
        this.name = _super.name;
    }

}

