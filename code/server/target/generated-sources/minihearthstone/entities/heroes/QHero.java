package minihearthstone.entities.heroes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHero is a Querydsl query type for Hero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHero extends EntityPathBase<Hero> {

    private static final long serialVersionUID = -1698994667L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHero hero = new QHero("hero");

    public final BooleanPath canUseSpecialSkill = createBoolean("canUseSpecialSkill");

    public final NumberPath<Integer> defense = createNumber("defense", Integer.class);

    public final StringPath description = createString("description");

    public final minihearthstone.entities.gameboard.QGameBoard gameBoard;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> lifepoints = createNumber("lifepoints", Integer.class);

    public final StringPath name = createString("name");

    public final BooleanPath original = createBoolean("original");

    public final StringPath skillType = createString("skillType");

    public final QAbstractSpecificHero specificHero;

    public final StringPath type = createString("type");

    public final StringPath uniqueId = createString("uniqueId");

    public QHero(String variable) {
        this(Hero.class, forVariable(variable), INITS);
    }

    public QHero(Path<? extends Hero> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHero(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHero(PathMetadata metadata, PathInits inits) {
        this(Hero.class, metadata, inits);
    }

    public QHero(Class<? extends Hero> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gameBoard = inits.isInitialized("gameBoard") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gameBoard")) : null;
        this.specificHero = inits.isInitialized("specificHero") ? new QAbstractSpecificHero(forProperty("specificHero")) : null;
    }

}

