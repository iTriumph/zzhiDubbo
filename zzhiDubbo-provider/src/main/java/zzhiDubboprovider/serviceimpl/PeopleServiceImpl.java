package zzhiDubboprovider.serviceimpl;

import org.springframework.stereotype.Service;
import zzhiDubboapi.po.People;
import zzhiDubboapi.service.PeopleService;

/**
 * Created by zhangzhii on 2017/12/15.
 */
@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

    @Override
    public People findPeople()
    {
        People po=new People();
        po.setAge(1);
        po.setName("zzhi");

        return  po;
    }

}
