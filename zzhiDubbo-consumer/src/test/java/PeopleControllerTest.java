import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import zzhiDubboconsumer.consumer;
import zzhiDubboconsumer.controller.HomeController;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by zhangzhii on 2017/12/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = consumer.class)
@WebAppConfiguration
public class PeopleControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(PeopleControllerTest.class);
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void test0() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/people")).
                andDo(print()).andReturn();
        logger.info("结果:{}",result.getResponse().getContentAsString());
    }


    @Test
    public void test1() throws Exception {
        String name="zzhi";
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/test1?name="+ name)).
                andDo(print()).andReturn();
        logger.info("结果:{}",result.getResponse().getContentAsString());
    }




}
