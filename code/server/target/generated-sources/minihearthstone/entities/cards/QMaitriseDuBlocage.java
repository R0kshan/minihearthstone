package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMaitriseDuBlocage is a Querydsl query type for MaitriseDuBlocage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMaitriseDuBlocage extends EntityPathBase<MaitriseDuBlocage> {

    private static final long serialVersionUID = 1319905074L;

    public static final QMaitriseDuBlocage maitriseDuBlocage = new QMaitriseDuBlocage("maitriseDuBlocage");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QMaitriseDuBlocage(String variable) {
        super(MaitriseDuBlocage.class, forVariable(variable));
    }

    public QMaitriseDuBlocage(Path<? extends MaitriseDuBlocage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMaitriseDuBlocage(PathMetadata metadata) {
        super(MaitriseDuBlocage.class, metadata);
    }

}

