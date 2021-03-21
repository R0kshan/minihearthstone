package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QConsecration is a Querydsl query type for Consecration
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConsecration extends EntityPathBase<Consecration> {

    private static final long serialVersionUID = -290034872L;

    public static final QConsecration consecration = new QConsecration("consecration");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QConsecration(String variable) {
        super(Consecration.class, forVariable(variable));
    }

    public QConsecration(Path<? extends Consecration> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConsecration(PathMetadata metadata) {
        super(Consecration.class, metadata);
    }

}

