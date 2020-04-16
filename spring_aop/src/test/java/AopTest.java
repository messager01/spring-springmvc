import demo1.GoodsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create by Shipeixin on 2020/4/16 11:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class AopTest {

    @Autowired
    GoodsDao goodsDao;

    @Test
    public void test(){

      /*  goodsDao.save();
        System.out.println("=========================================");
       // goodsDao.delete();
        goodsDao.update();*/
      //goodsDao.delete();

        goodsDao.find();
    }
}
