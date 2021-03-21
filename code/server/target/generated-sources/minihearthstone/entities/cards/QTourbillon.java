package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTourbillon is a Querydsl query type for Tourbillon
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTourbillon extends EntityPathBase<Tourbillon> {

    private static final long serialVersionUID = -1767467212L;

    public static final QTourbillon tourbillon = new QTourbillon("tourbillon");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QTourbillon(String variable) {
        super(Tourbillon.class, forVariable(variable));
    }

    public QTourbillon(Path<? extends Tourbillon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTourbillon(PathMetadata metadata) {
        super(Tourbillon.class, metadata);
    }

}

