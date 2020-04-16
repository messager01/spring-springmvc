import com.spx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by Shipeixin on 2020/4/16 15:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransferMoney {

    @Autowired
    AccountService accountService;

    @Test
    public void test(){

        accountService.transferMoney("AAA","BBB",500.0);
    }
}
