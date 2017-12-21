package zzhiDubboprovider.serviceimpl;

import zzhiDubboapi.service.GoldbachDefine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GoldbachDefineImp extends UnicastRemoteObject implements GoldbachDefine {



    public GoldbachDefineImp() throws RemoteException {
        // TODO Auto-generated constructor stub
        super();
    }

    @Override
    public String checkNum(int num) throws RemoteException {

        return num+"";
    }

    public Boolean isPrimeNum(int num){

        for(int i=2;i<(num/2+1);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
