import demo1.GoodsDao;
import demo1.GoodsDaoImpl;
import demo1.GoodsJDKProxy;
import org.junit.Test;

/**
 * create by Shipeixin on 2020/4/15 23:31
 */
public class MyTest {


    @Test
    public void test1(){
        GoodsDao goodsDao = new GoodsDaoImpl();

        System.out.println(goodsDao);


        GoodsJDKProxy goodsJDKProxy = new GoodsJDKProxy();
        GoodsDao proxy = goodsJDKProxy.createProxy(goodsDao);


        proxy.save();
        proxy.delete();

    }
}
