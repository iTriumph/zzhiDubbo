package zzhiDubboconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.caucho.HessianServiceExporter;
import zzhiDubboapi.service.hessianService;

/**
 * Created by zhangzhii on 2017/12/15.
 */
@SpringBootApplication
@ComponentScan(value = { "zzhiDubboconsumer" })
public class consumer {

    public static void main(String[] args) {
        SpringApplication.run(consumer.class, args);
    }

    @Autowired
    private hessianService hessianService;
    @Bean(name = "/hessianService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(hessianService);
        exporter.setServiceInterface(hessianService.class);
        return exporter;
    }

}
