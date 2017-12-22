import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zzhiDubboconsumer.Sender;
import zzhiDubboconsumer.consumer;

/**
 * Created by zhangzhii on 2017/12/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = consumer.class)
public class MqTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for(int i=0;i<10;i++) {
            sender.send();
            Thread.sleep(2000);
        }
    }
}
