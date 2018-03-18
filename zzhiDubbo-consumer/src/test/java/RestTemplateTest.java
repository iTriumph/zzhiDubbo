import com.alibaba.fastjson.JSONObject;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangzhii on 2018/3/15.
 */
public class RestTemplateTest {


    @Test
    public void test2() {
        RestTemplate restTemplate = new RestTemplate();

        JSONObject jsonParam = new JSONObject();
        jsonParam.put("state", "1");//状态
        jsonParam.put("compCode", "2");//公司代码
        jsonParam.put("meterCode", "1");//表钢号
        jsonParam.put("firmCode", "1");//厂商编码
        jsonParam.put("materielCode", "1");//表计物料
        jsonParam.put("protocol", "1");//通讯协议类型
        jsonParam.put("readingUnit", "");
        String json = jsonParam.toJSONString();

        try {

            String result = restTemplate.postForObject("http://localhost:8080/test2", json, String.class);
            System.out.println(result);
        } catch (Exception e) {
            throw e;
        }
    }

}
