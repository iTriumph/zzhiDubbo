import org.junit.Test;
import zzhiDubboapi.service.GoldbachDefine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by zhangzhii on 2017/12/20.
 */
public class RMITest {

    @Test
    public void client() throws MalformedURLException,RemoteException,NotBoundException {

        GoldbachDefine goldbach = (GoldbachDefine) Naming.lookup("rmi://localhost:8888/Goldbach");
        //output the client result
        System.out.println("client:");
        for(int i=0 ;i<10;i++) {
            System.out.println(goldbach.checkNum(i));
        }
    }
}
