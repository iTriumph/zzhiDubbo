import org.junit.Test;
import zzhiDubboapi.service.GoldbachDefine;
import zzhiDubboprovider.serviceimpl.GoldbachDefineImp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by zhangzhii on 2017/12/20.
 */
public class RMITest {

//    @Test
//    public void server() throws RemoteException,MalformedURLException,AlreadyBoundException {
//        GoldbachDefine goldbach;
//        goldbach = new GoldbachDefineImp();
//
//        //register object
//        LocateRegistry.createRegistry(8888);
//        //bing the object to server
//        Naming.bind("rmi://localhost:8888/Goldbach", goldbach);
//        System.out.println("server:begin to listen");
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
