package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractSpecificHero is a Querydsl query type for AbstractSpecificHero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAbstractSpecificHero extends EntityPathBase<AbstractSpecificHero> {

    private static final long serialVersionUID = 1472357801L;

    public static final QAbstractSpecificHero abstractSpecificHero = new QAbstractSpecificHero("abstractSpecificHero");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> manacost = createNumber("manacost", Integer.class);

    public QAbstractSpecificHero(String variable) {
        super(AbstractSpecificHero.class, forVariable(variable));
    }

    public QAbstractSpecificHero(Path<? extends AbstractSpecificHero> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractSpecificHero(PathMetadata metadata) {
        super(AbstractSpecificHero.class, metadata);
    }

}

