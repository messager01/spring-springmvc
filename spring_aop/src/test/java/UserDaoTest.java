import demo1.UserDao;
import demo1.UserDaoCglibProxy;
import org.junit.Test;

/**
 * create by Shipeixin on 2020/4/16 10:37
 */
public class UserDaoTest {

    @Test
    public void test1(){
        UserDao userDao = new UserDao();
        //userDao.save();

        UserDaoCglibProxy userDaoCglibProxy = new UserDaoCglibProxy();
        UserDao userDao1 = userDaoCglibProxy.cglibProxy(userDao);

        userDao1.save();
    }
}
