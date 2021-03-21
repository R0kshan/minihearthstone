package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBasicHero is a Querydsl query type for BasicHero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBasicHero extends EntityPathBase<BasicHero> {

    private static final long serialVersionUID = 728323085L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBasicHero basicHero = new QBasicHero("basicHero");

    public final QHero _super;

    //inherited
    public final BooleanPath canUseSpecialSkill;

    //inherited
    public final NumberPath<Integer> defense;

    //inherited
    public final StringPath description;

    // inherited
    public final minihearthstone.entities.gameboard.QGameBoard gameBoard;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final NumberPath<Integer> lifepoints;

    //inherited
    public final StringPath name;

    //inherited
    public final BooleanPath original;

    //inherited
    public final StringPath skillType;

    // inherited
    public final QAbstractSpecificHero specificHero;

    //inherited
    public final StringPath type;

    //inherited
    public final StringPath uniqueId;

    public QBasicHero(String variable) {
        this(BasicHero.class, forVariable(variable), INITS);
    }

    public QBasicHero(Path<? extends BasicHero> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBasicHero(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBasicHero(PathMetadata metadata, PathInits inits) {
        this(BasicHero.class, metadata, inits);
    }

    public QBasicHero(Class<? extends BasicHero> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QHero(type, metadata, inits);
        this.canUseSpecialSkill = _super.canUseSpecialSkill;
        this.defense = _super.defense;
        this.description = _super.description;
        this.gameBoard = _super.gameBoard;
        this.id = _super.id;
        this.lifepoints = _super.lifepoints;
        this.name = _super.name;
        this.original = _super.original;
        this.skillType = _super.skillType;
        this.specificHero = _super.specificHero;
        this.type = _super.type;
        this.uniqueId = _super.uniqueId;
    }

}

