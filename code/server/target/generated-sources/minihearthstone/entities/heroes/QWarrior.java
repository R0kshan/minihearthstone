package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWarrior is a Querydsl query type for Warrior
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWarrior extends EntityPathBase<Warrior> {

    private static final long serialVersionUID = 1752789319L;

    public static final QWarrior warrior = new QWarrior("warrior");

    public final QAbstractSpecificHero _super = new QAbstractSpecificHero(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Integer> manacost = _super.manacost;

    public QWarrior(String variable) {
        super(Warrior.class, forVariable(variable));
    }

    public QWarrior(Path<? extends Warrior> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWarrior(PathMetadata metadata) {
        super(Warrior.class, metadata);
    }

}

