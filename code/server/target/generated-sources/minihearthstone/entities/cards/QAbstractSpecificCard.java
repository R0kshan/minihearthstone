package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractSpecificCard is a Querydsl query type for AbstractSpecificCard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAbstractSpecificCard extends EntityPathBase<AbstractSpecificCard> {

    private static final long serialVersionUID = -675174438L;

    public static final QAbstractSpecificCard abstractSpecificCard = new QAbstractSpecificCard("abstractSpecificCard");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QAbstractSpecificCard(String variable) {
        super(AbstractSpecificCard.class, forVariable(variable));
    }

    public QAbstractSpecificCard(Path<? extends AbstractSpecificCard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractSpecificCard(PathMetadata metadata) {
        super(AbstractSpecificCard.class, metadata);
    }

}

