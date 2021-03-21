package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaladin is a Querydsl query type for Paladin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPaladin extends EntityPathBase<Paladin> {

    private static final long serialVersionUID = -170821720L;

    public static final QPaladin paladin = new QPaladin("paladin");

    public final QAbstractSpecificHero _super = new QAbstractSpecificHero(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Integer> manacost = _super.manacost;

    public QPaladin(String variable) {
        super(Paladin.class, forVariable(variable));
    }

    public QPaladin(Path<? extends Paladin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaladin(PathMetadata metadata) {
        super(Paladin.class, metadata);
    }

}

