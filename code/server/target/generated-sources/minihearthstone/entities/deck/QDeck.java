package minihearthstone.entities.deck;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeck is a Querydsl query type for Deck
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeck extends EntityPathBase<Deck> {

    private static final long serialVersionUID = -530498013L;

    public static final QDeck deck1 = new QDeck("deck1");

    public final StringPath cardNames = createString("cardNames");

    public final ListPath<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard> deck = this.<minihearthstone.entities.cards.Card, minihearthstone.entities.cards.QCard>createList("deck", minihearthstone.entities.cards.Card.class, minihearthstone.entities.cards.QCard.class, PathInits.DIRECT2);

    public final NumberPath<Long> heroId = createNumber("heroId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QDeck(String variable) {
        super(Deck.class, forVariable(variable));
    }

    public QDeck(Path<? extends Deck> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeck(PathMetadata metadata) {
        super(Deck.class, metadata);
    }

}

