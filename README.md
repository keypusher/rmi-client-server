# rmi-client-server
Simple Java implementation of a RMI client &amp; server

The server shell script will compile the server libs as jar and then run the server.  
Run it like so:

    ./server.sh
  
Now start the client:

    ./client.sh
  
Client is currently implemented as a Groovy script, if you prefer to run it as java simply change the extension to .java and compile & run.  Notice the classpath, both pwd(.) and the jar must be added, and separated by os-dependant pathsep.  On linux use colon, on windows use semicolon.

    javac -cp server.jar Client.java
    java -cp ".:server.jar" Client
