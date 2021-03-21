package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QImageMirroir is a Querydsl query type for ImageMirroir
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QImageMirroir extends EntityPathBase<ImageMirroir> {

    private static final long serialVersionUID = -34538793L;

    public static final QImageMirroir imageMirroir = new QImageMirroir("imageMirroir");

    public final QAbstractSpecificCard _super = new QAbstractSpecificCard(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QImageMirroir(String variable) {
        super(ImageMirroir.class, forVariable(variable));
    }

    public QImageMirroir(Path<? extends ImageMirroir> path) {
        super(path.getType(), path.getMetadata());
    }

    public QImageMirroir(PathMetadata metadata) {
        super(ImageMirroir.class, metadata);
    }

}

