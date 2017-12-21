package zzhiDubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

/**
 * Created by zhangzhii on 2017/12/15.
 */
@SpringBootApplication
@ComponentScan(value = { "zzhiDubboprovider" })
public class provider {

    public static void main(String[] args) {

        SpringApplication.run(provider.class, args);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}