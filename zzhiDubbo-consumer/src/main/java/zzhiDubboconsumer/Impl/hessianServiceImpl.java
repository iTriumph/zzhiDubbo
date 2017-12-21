package zzhiDubboconsumer.Impl;

import org.springframework.stereotype.Service;
import zzhiDubboapi.service.hessianService;

/**
 * Created by zhangzhii on 2017/12/20.
 */
@Service("hessianService")
public class hessianServiceImpl implements hessianService
{
    @Override
    public String sayHello(String name) {
        return "Hello World! " + name;
    }
}
