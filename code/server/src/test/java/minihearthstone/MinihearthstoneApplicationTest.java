package minihearthstone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import minihearthstone.MinihearthstoneApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MinihearthstoneApplication.class)

public class MinihearthstoneApplicationTest {

	@Test
	public void contextLoads() {
	}

}
