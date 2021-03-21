package minihearthstone.entities.cards.effects;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChargeEffect is a Querydsl query type for ChargeEffect
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChargeEffect extends EntityPathBase<ChargeEffect> {

    private static final long serialVersionUID = -1068069369L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChargeEffect chargeEffect = new QChargeEffect("chargeEffect");

    public final QAbstractEffect _super;

    // inherited
    public final minihearthstone.entities.cards.QCard effectMapping;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    public QChargeEffect(String variable) {
        this(ChargeEffect.class, forVariable(variable), INITS);
    }

    public QChargeEffect(Path<? extends ChargeEffect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChargeEffect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChargeEffect(PathMetadata metadata, PathInits inits) {
        this(ChargeEffect.class, metadata, inits);
    }

    public QChargeEffect(Class<? extends ChargeEffect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QAbstractEffect(type, metadata, inits);
        this.effectMapping = _super.effectMapping;
        this.id = _super.id;
        this.name = _super.name;
    }

}

