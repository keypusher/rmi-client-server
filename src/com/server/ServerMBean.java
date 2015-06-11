
package com.server;

public interface ServerMBean {

    public void talk();
    public Talker getTalker();
    public RemoteTalkerInterface getRemoteTalker();

}

