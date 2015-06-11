
package com.server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;
import java.rmi.server.Unreferenced;

public class RemoteTalker implements RemoteTalkerInterface, Remote, Unreferenced {

	public RemoteTalker() throws java.rmi.RemoteException {
	    UnicastRemoteObject.exportObject(this, 1099);
    	}

	public void talk() throws RemoteException {
		System.out.println("Remote Talker: Hello!");
	}
	
    public void unreferenced() {
	System.out.println("I am the unreferenced!");
    }
}

