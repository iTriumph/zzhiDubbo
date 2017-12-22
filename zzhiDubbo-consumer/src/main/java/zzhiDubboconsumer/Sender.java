package zzhiDubboconsumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhangzhii on 2017/12/21.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("发送者 : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
