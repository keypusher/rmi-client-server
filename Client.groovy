
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.management.AttributeChangeNotification;
import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.Notification;
import javax.management.NotificationEmitter;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import com.server.ServerMBean;

public class Client {

	public static void main(String[] args) throws Exception {

		System.out.println("Create an RMI connector client and connect it to the RMI connector server");
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://:1099/jmxrmi");
		JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
		MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

		ObjectName mbeanName = new ObjectName("com.server:type=Server");
		ServerMBean serverProxy = JMX.newMBeanProxy(mbsc, mbeanName, ServerMBean.class);

		System.out.println("Invoke Server Proxy...");
		serverProxy.talk();
		serverProxy.getTalker().talk();
		serverProxy.getRemoteTalker().talk();

	}
	
}
