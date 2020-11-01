package minihearthstone.entities.cards;

import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import minihearthstone.entities.cards.Card;

import org.mockito.Mock;
import org.junit.Test;
import org.junit.Rule;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CardMockTest  {

    @Mock private Card cardMock; 

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

    @Test
    public void testToString()  {
        Card mockedCard = mock(Card.class);
        when(mockedCard.toString()).thenReturn(
            "[id=0, name=CarteTestServeur, manacost=1, dommage=1, lifepoints=2]");
        assertEquals("[id=0, name=CarteTestServeur, manacost=1, dommage=1, lifepoints=2]", 
                    mockedCard.toString());
    }

    
}