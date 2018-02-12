package util;

import config.JpaConfig;
import javax.transaction.Transactional;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
@TestPropertySource("classpath:db-config-test.properties")
@Transactional
public abstract class RepositoryIT {

}
