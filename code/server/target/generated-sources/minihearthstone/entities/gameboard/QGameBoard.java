package minihearthstone.entities.gameboard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGameBoard is a Querydsl query type for GameBoard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGameBoard extends EntityPathBase<GameBoard> {

    private static final long serialVersionUID = -62703697L;

    public static final QGameBoard gameBoard = new QGameBoard("gameBoard");

    public final StringPath attackedServants = createString("attackedServants");

    public final NumberPath<Long> gameId = createNumber("gameId", Long.class);

    public final StringPath heroAttacked = createString("heroAttacked");

    public final ListPath<minihearthstone.entities.heroes.Hero, minihearthstone.entities.heroes.QHero> heroes = this.<minihearthstone.entities.heroes.Hero, minihearthstone.entities.heroes.QHero>createList("heroes", minihearthstone.entities.heroes.Hero.class, minihearthstone.entities.heroes.QHero.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard> p1CardsOnGround = this.<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard>createList("p1CardsOnGround", minihearthstone.entities.cards.Card.class, minihearthstone.entities.cards.QCard.class, PathInits.DIRECT2);

    public final NumberPath<Long> p1ClientId = createNumber("p1ClientId", Long.class);

    public final ListPath<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard> p1HandOfCards = this.<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard>createList("p1HandOfCards", minihearthstone.entities.cards.Card.class, minihearthstone.entities.cards.QCard.class, PathInits.DIRECT2);

    public final ListPath<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard> p2CardsOnGround = this.<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard>createList("p2CardsOnGround", minihearthstone.entities.cards.Card.class, minihearthstone.entities.cards.QCard.class, PathInits.DIRECT2);

    public final NumberPath<Long> p2ClientId = createNumber("p2ClientId", Long.class);

    public final ListPath<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard> p2HandOfCards = this.<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard>createList("p2HandOfCards", minihearthstone.entities.cards.Card.class, minihearthstone.entities.cards.QCard.class, PathInits.DIRECT2);

    public final ListPath<minihearthstone.entities.player.Player, minihearthstone.entities.player.QPlayer> players = this.<minihearthstone.entities.player.Player, minihearthstone.entities.player.QPlayer>createList("players", minihearthstone.entities.player.Player.class, minihearthstone.entities.player.QPlayer.class, PathInits.DIRECT2);

    public final NumberPath<Long> turn = createNumber("turn", Long.class);

    public final NumberPath<Long> winner = createNumber("winner", Long.class);

    public QGameBoard(String variable) {
        super(GameBoard.class, forVariable(variable));
    }

    public QGameBoard(Path<? extends GameBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGameBoard(PathMetadata metadata) {
        super(GameBoard.class, metadata);
    }

}

