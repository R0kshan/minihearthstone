package minihearthstone.entities.heroes;

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
public class HeroJPARepositoryTest {
    @Autowired
    EntityManager entityManager;
    @Autowired
    HeroRepository heroRepository;

    @Test
    public void injectedComponentsAreNotNull(){
        assertNotNull(entityManager);
        assertNotNull(heroRepository);
    }



    public List convertToList(Iterable iterable) {
        List target = new ArrayList();
        iterable.forEach(target::add);
        return target;
    }
}
