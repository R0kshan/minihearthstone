package minihearthstone.entities.cards;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBasicCard is a Querydsl query type for BasicCard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBasicCard extends EntityPathBase<BasicCard> {

    private static final long serialVersionUID = -1575171352L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBasicCard basicCard = new QBasicCard("basicCard");

    public final QCard _super;

    //inherited
    public final BooleanPath canAttack;

    //inherited
    public final StringPath clientTooltip;

    //inherited
    public final NumberPath<Integer> damage;

    // inherited
    public final minihearthstone.entities.deck.QDeck deck;

    //inherited
    public final NumberPath<Integer> defense;

    //inherited
    public final StringPath description;

    // inherited
    public final minihearthstone.entities.cards.effects.QAbstractEffect effect;

    // inherited
    public final minihearthstone.entities.gameboard.QGameBoard gbP1CardsOnGroundMapping;

    // inherited
    public final minihearthstone.entities.gameboard.QGameBoard gbP1HandOfCardsMapping;

    // inherited
    public final minihearthstone.entities.gameboard.QGameBoard gbP2CardsOnGroundMapping;

    // inherited
    public final minihearthstone.entities.gameboard.QGameBoard gbP2HandOfCardsMapping;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final NumberPath<Integer> lifepoints;

    //inherited
    public final NumberPath<Integer> manacost;

    //inherited
    public final StringPath name;

    //inherited
    public final StringPath nature;

    // inherited
    public final QAbstractSpecificCard specificCard;

    //inherited
    public final StringPath type;

    //inherited
    public final StringPath uniqueId;

    public QBasicCard(String variable) {
        this(BasicCard.class, forVariable(variable), INITS);
    }

    public QBasicCard(Path<? extends BasicCard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBasicCard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBasicCard(PathMetadata metadata, PathInits inits) {
        this(BasicCard.class, metadata, inits);
    }

    public QBasicCard(Class<? extends BasicCard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCard(type, metadata, inits);
        this.canAttack = _super.canAttack;
        this.clientTooltip = _super.clientTooltip;
        this.damage = _super.damage;
        this.deck = _super.deck;
        this.defense = _super.defense;
        this.description = _super.description;
        this.effect = _super.effect;
        this.gbP1CardsOnGroundMapping = _super.gbP1CardsOnGroundMapping;
        this.gbP1HandOfCardsMapping = _super.gbP1HandOfCardsMapping;
        this.gbP2CardsOnGroundMapping = _super.gbP2CardsOnGroundMapping;
        this.gbP2HandOfCardsMapping = _super.gbP2HandOfCardsMapping;
        this.id = _super.id;
        this.lifepoints = _super.lifepoints;
        this.manacost = _super.manacost;
        this.name = _super.name;
        this.nature = _super.nature;
        this.specificCard = _super.specificCard;
        this.type = _super.type;
        this.uniqueId = _super.uniqueId;
    }

}

