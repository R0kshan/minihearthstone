package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCard is a Querydsl query type for Card
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCard extends EntityPathBase<Card> {

    private static final long serialVersionUID = -20300218L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCard card = new QCard("card");

    public final BooleanPath canAttack = createBoolean("canAttack");

    public final StringPath clientTooltip = createString("clientTooltip");

    public final NumberPath<Integer> damage = createNumber("damage", Integer.class);

    public final minihearthstone.entities.deck.QDeck deck;

    public final NumberPath<Integer> defense = createNumber("defense", Integer.class);

    public final StringPath description = createString("description");

    public final minihearthstone.entities.cards.effects.QAbstractEffect effect;

    public final minihearthstone.entities.gameboard.QGameBoard gbP1CardsOnGroundMapping;

    public final minihearthstone.entities.gameboard.QGameBoard gbP1HandOfCardsMapping;

    public final minihearthstone.entities.gameboard.QGameBoard gbP2CardsOnGroundMapping;

    public final minihearthstone.entities.gameboard.QGameBoard gbP2HandOfCardsMapping;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> lifepoints = createNumber("lifepoints", Integer.class);

    public final NumberPath<Integer> manacost = createNumber("manacost", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath nature = createString("nature");

    public final QAbstractSpecificCard specificCard;

    public final StringPath type = createString("type");

    public final StringPath uniqueId = createString("uniqueId");

    public QCard(String variable) {
        this(Card.class, forVariable(variable), INITS);
    }

    public QCard(Path<? extends Card> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCard(PathMetadata metadata, PathInits inits) {
        this(Card.class, metadata, inits);
    }

    public QCard(Class<? extends Card> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deck = inits.isInitialized("deck") ? new minihearthstone.entities.deck.QDeck(forProperty("deck")) : null;
        this.effect = inits.isInitialized("effect") ? new minihearthstone.entities.cards.effects.QAbstractEffect(forProperty("effect"), inits.get("effect")) : null;
        this.gbP1CardsOnGroundMapping = inits.isInitialized("gbP1CardsOnGroundMapping") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gbP1CardsOnGroundMapping")) : null;
        this.gbP1HandOfCardsMapping = inits.isInitialized("gbP1HandOfCardsMapping") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gbP1HandOfCardsMapping")) : null;
        this.gbP2CardsOnGroundMapping = inits.isInitialized("gbP2CardsOnGroundMapping") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gbP2CardsOnGroundMapping")) : null;
        this.gbP2HandOfCardsMapping = inits.isInitialized("gbP2HandOfCardsMapping") ? new minihearthstone.entities.gameboard.QGameBoard(forProperty("gbP2HandOfCardsMapping")) : null;
        this.specificCard = inits.isInitialized("specificCard") ? new QAbstractSpecificCard(forProperty("specificCard")) : null;
    }

}

