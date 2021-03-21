package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetamorphose is a Querydsl query type for Metamorphose
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMetamorphose extends EntityPathBase<Metamorphose> {

    private static final long serialVersionUID = 1916989236L;

    public static final QMetamorphose metamorphose = new QMetamorphose("metamorphose");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QMetamorphose(String variable) {
        super(Metamorphose.class, forVariable(variable));
    }

    public QMetamorphose(Path<? extends Metamorphose> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetamorphose(PathMetadata metadata) {
        super(Metamorphose.class, metadata);
    }

}

