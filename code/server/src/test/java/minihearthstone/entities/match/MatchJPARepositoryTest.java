package minihearthstone.entities.match;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;


@RunWith(SpringRunner.class)
@DataJpaTest
public class MatchJPARepositoryTest {

    @Autowired EntityManager entityManager;
    @Autowired MatchRepository matchRepository;

    @Test
    public void injectedComponentsAreNotNull(){
        assertNotNull(entityManager);
        assertNotNull(matchRepository);
    }

    @Test
    public void testFindAllByP2ClientIdIsNull() {
        String p1ClientId = "12";
        Match match = new Match(p1ClientId);
        matchRepository.save(match);
        // assertEquals(1,matchRepository.findAllByP2ClientIdIsNull().size());

    }

    public List convertToList(Iterable iterable) {
        List target = new ArrayList();
        iterable.forEach(target::add);
        return target;
    }

}
