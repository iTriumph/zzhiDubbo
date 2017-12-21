package zzhiDubboapi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zhangzhii on 2017/12/20.
 */
public interface GoldbachDefine extends Remote {
    public String checkNum(int num) throws RemoteException;

}