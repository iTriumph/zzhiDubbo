import org.junit.Test;
import zzhiDubboapi.service.ISpiDemo;
import zzhiDubboprovider.CustomServiceLoader;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangzhii on 2017/12/18.
 */
public class SpiTest {

    @Test
    public void  spiTest1()
    {
        System.out.println("start");
        Iterator<ISpiDemo> spiDemos = SpiDemoFactory.getSpiDemo();
        while(spiDemos.hasNext()){
            ISpiDemo spiDemo = spiDemos.next();
            spiDemo.test();
        }
        System.out.println("end");



        System.out.println("start 2");
        List<ISpiDemo> animals = null;
        try {
            animals = CustomServiceLoader.loade(ISpiDemo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (ISpiDemo animal : animals){
            animal.test();
        }

        System.out.println("end2");
    }
}
