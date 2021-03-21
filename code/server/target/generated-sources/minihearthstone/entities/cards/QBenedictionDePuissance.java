package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBenedictionDePuissance is a Querydsl query type for BenedictionDePuissance
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBenedictionDePuissance extends EntityPathBase<BenedictionDePuissance> {

    private static final long serialVersionUID = 1683734704L;

    public static final QBenedictionDePuissance benedictionDePuissance = new QBenedictionDePuissance("benedictionDePuissance");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QBenedictionDePuissance(String variable) {
        super(BenedictionDePuissance.class, forVariable(variable));
    }

    public QBenedictionDePuissance(Path<? extends BenedictionDePuissance> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBenedictionDePuissance(PathMetadata metadata) {
        super(BenedictionDePuissance.class, metadata);
    }

}

