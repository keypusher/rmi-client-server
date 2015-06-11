
package com.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteTalkerMBean extends Remote {

    public void talk() throws RemoteException;

}

