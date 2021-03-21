package minihearthstone.entities.player;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlayer is a Querydsl query type for Player
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlayer extends EntityPathBase<Player> {

    private static final long serialVersionUID = -784519325L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlayer player = new QPlayer("player");

    public final NumberPath<Long> clientId = createNumber("clientId", Long.class);

    public final minihearthstone.entities.gameboard.QGameBoard gameBoard;

    public final NumberPath<Long> heroId = createNumber("heroId", Long.class);

    public final StringPath heroUniqueId = createString("heroUniqueId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> mana = createNumber("mana", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath status = createString("status");

    public final NumberPath<Integer> stored_mana = createNumber("stored_mana", Integer.class);

    public QPlayer(String variable) {
        this(Player.class, forVariable(variable), INITS);
    }

    public QPlayer(Path<? extends Player> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlayer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlayer(PathMetadata metadata, PathInits inits) {
        this(Player.class, metadata, inits);
    }

    public QPlayer(Class<? extends Player> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gameBoard = inits.isInitialized("gameBoard") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gameBoard")) : null;
    }

}

