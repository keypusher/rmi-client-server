echo "Compiling"
javac src/com/server/*.java
echo "Building Jar"
jar cvf server.jar -C src .
echo "Running server"
java -cp ./src -Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false com.server.Server
