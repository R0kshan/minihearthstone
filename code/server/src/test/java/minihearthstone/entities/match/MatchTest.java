package minihearthstone.entities.match;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.transaction.Transactional;

import static minihearthstone.AssertAnnotations.*;
import static org.junit.Assert.*;

public class MatchTest {

    @Autowired
    private MatchRepository matchRepository;

    /**
     * Test for the method {@link Match#setAnswer(String,String)}
     */
    @Test
    public void setAnswerFromP1(){
        final String p1Ans = "p1Ans";
        final String p2Ans = "p2Ans";
        final String p1Id = "p1Id";
        final String p2Id = "P2Id"; 
        Match match = new Match(p1Ans,p2Ans,p1Id,p2Id);
        final String newAns = "newAns";
        match.setAnswer(p1Id, newAns);

        assertEquals(newAns,match.getP1Answer());
        assertNotEquals(newAns, match.getP2Answer());
    }

    /**
     * Test for the method {@link Match#setAnswer(String,String)}
     */
    @Test
    public void setAnswerFromP2(){
        String p1Ans = "p1Ans";
        String p2Ans = "p2Ans";
        String p1Id = "p1Id";
        String p2Id = "P2Id"; 
        Match match = new Match(p1Ans,p2Ans,p1Id,p2Id);
        String newAns = "newAns";
        match.setAnswer(p2Id, newAns);

        assertEquals(newAns,match.getP2Answer());
        assertNotEquals(newAns, match.getP1Answer());

    }
    
    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Match.class, Entity.class, Transactional.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Match.class, "id", Id.class, GeneratedValue.class);
        assertField(Match.class, "p1Answer");
        assertField(Match.class, "p2Answer");
        assertField(Match.class, "p1ClientId");
        assertField(Match.class, "p2ClientId");
    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(Match.class, "getId");
        assertGetter(Match.class, "getP1Answer");
        assertGetter(Match.class, "getP2Answer");
        assertGetter(Match.class, "getPlayer1");
        assertGetter(Match.class, "getPlayer2");
    }

}
