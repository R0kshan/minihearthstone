package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMage is a Querydsl query type for Mage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMage extends EntityPathBase<Mage> {

    private static final long serialVersionUID = -1698849907L;

    public static final QMage mage = new QMage("mage");

    public final QAbstractSpecificHero _super = new QAbstractSpecificHero(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Integer> manacost = _super.manacost;

    public QMage(String variable) {
        super(Mage.class, forVariable(variable));
    }

    public QMage(Path<? extends Mage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMage(PathMetadata metadata) {
        super(Mage.class, metadata);
    }

}

