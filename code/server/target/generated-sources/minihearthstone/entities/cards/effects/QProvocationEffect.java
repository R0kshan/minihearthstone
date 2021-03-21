package minihearthstone.entities.cards.effects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProvocationEffect is a Querydsl query type for ProvocationEffect
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProvocationEffect extends EntityPathBase<ProvocationEffect> {

    private static final long serialVersionUID = -1943944601L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProvocationEffect provocationEffect = new QProvocationEffect("provocationEffect");

    public final QAbstractEffect _super;

    // inherited
    public final minihearthstone.entities.cards.QCard effectMapping;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    public QProvocationEffect(String variable) {
        this(ProvocationEffect.class, forVariable(variable), INITS);
    }

    public QProvocationEffect(Path<? extends ProvocationEffect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProvocationEffect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProvocationEffect(PathMetadata metadata, PathInits inits) {
        this(ProvocationEffect.class, metadata, inits);
    }

    public QProvocationEffect(Class<? extends ProvocationEffect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QAbstractEffect(type, metadata, inits);
        this.effectMapping = _super.effectMapping;
        this.id = _super.id;
        this.name = _super.name;
    }

}

