package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExplosionDesArcanes is a Querydsl query type for ExplosionDesArcanes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExplosionDesArcanes extends EntityPathBase<ExplosionDesArcanes> {

    private static final long serialVersionUID = -648732294L;

    public static final QExplosionDesArcanes explosionDesArcanes = new QExplosionDesArcanes("explosionDesArcanes");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QExplosionDesArcanes(String variable) {
        super(ExplosionDesArcanes.class, forVariable(variable));
    }

    public QExplosionDesArcanes(Path<? extends ExplosionDesArcanes> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExplosionDesArcanes(PathMetadata metadata) {
        super(ExplosionDesArcanes.class, metadata);
    }

}

