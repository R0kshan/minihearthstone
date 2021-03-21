package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChefDeRaid is a Querydsl query type for ChefDeRaid
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChefDeRaid extends EntityPathBase<ChefDeRaid> {

    private static final long serialVersionUID = 596883911L;

    public static final QChefDeRaid chefDeRaid = new QChefDeRaid("chefDeRaid");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QChefDeRaid(String variable) {
        super(ChefDeRaid.class, forVariable(variable));
    }

    public QChefDeRaid(Path<? extends ChefDeRaid> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChefDeRaid(PathMetadata metadata) {
        super(ChefDeRaid.class, metadata);
    }

}

