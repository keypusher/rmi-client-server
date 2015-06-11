
package com.server;
import java.rmi.RemoteException;
import java.lang.management.*;
import javax.management.*;

public class Server implements ServerMBean {

	static Talker talker;
	static RemoteTalker remoteTalker;

	public Server() throws RemoteException {
		talker = new Talker();
		remoteTalker = new RemoteTalker();
	}

	public Talker getTalker() {
		return talker;
	}

	public RemoteTalkerInterface getRemoteTalker() {
		return remoteTalker;
	}

	public void talk() {
		System.out.println("Server: Hello!");
	}

        public static void main(String[] args) throws Exception {

                Server server = new Server();
                
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

                ObjectName serverName = new ObjectName("com.server:type=Server");
                mbs.registerMBean(server, serverName);

                //ObjectName talkerName = new ObjectName("com.demo:type=RemoteTalker");
        		//mbs.registerMBean(remoteTalker, talkerName);

                System.out.println("Waiting forever...");
                Thread.sleep(Long.MAX_VALUE);
        }

}

