package zzhiDubboapi.po;

import java.io.Serializable;

/**
 * Created by zhangzhii on 2017/12/15.
 */
public class People implements Serializable {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private  Integer age;

}
