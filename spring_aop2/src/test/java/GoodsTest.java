import com.spx.GoodsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by Shipeixin on 2020/4/16 12:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class GoodsTest {

    @Autowired
    GoodsDao goodsDao;
    @Test
    public void test(){
       // goodsDao.save();


        //oodsDao.update();


        goodsDao.delete();
    }
}
