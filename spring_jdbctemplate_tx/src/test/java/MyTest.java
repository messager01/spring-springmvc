import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by Shipeixin on 2020/4/16 13:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        //System.out.println(jdbcTemplate);

        jdbcTemplate.update("insert  into  `account` values (null,?,?)","AAA",1000.01);


    }
}
