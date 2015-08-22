
############################

Webservice tutorial using JDK 1.6 (Only)

Steps to create a simple webservice using set of some classes and interfaces with annotations.

1. Create an interface with methods that you want to expose as a webservice operation.

       In Tutorial , You can take a look at TimeServer.java interface . 
    
2. Annotate this interface with @WebService annotation.

3. Create a implementor class for TimeServer inteface and implement the same.

4.Annotate the implementor class with @WebService(endpointInterface="com.taggy.quickstart.TimeServer")

       It gives the reference of webservice interface i.e TimeServer.java 
    
5. Write the code for method implemetations.

6. Publish the service using "Endpoint.publish(<URL>,<Implementor class>);"

       You can take a look at TimeServerPublisher.java
  
        This uses very simple mechanism to publish a service.
  
7. Browse the WSDL generate @ http://127.0.0.1:8443/TimeMachineService?wsdl


8. Create a client to access the service as mentioned in /Chapter1/src/com/taggy/quickstart/TimeServerRequestor.java


==================================================================================================================================================
