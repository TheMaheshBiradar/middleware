package com.taggy.services.employeeservice.v1_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-03-04T09:15:35.813+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "employeeService", 
                  wsdlLocation = "file:/C:/Users/Mahesh/Dropbox/POCs/taggy-schema/target/com/taggy/services/authentication/1.0/wsdl/employeeservice.wsdl",
                  targetNamespace = "http://com/taggy/services/employeeservice/v1.0") 
public class EmployeeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://com/taggy/services/employeeservice/v1.0", "employeeService");
    public final static QName Employeeserviceport = new QName("http://com/taggy/services/employeeservice/v1.0", "employeeserviceport");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Mahesh/Dropbox/POCs/taggy-schema/target/com/taggy/services/authentication/1.0/wsdl/employeeservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EmployeeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Mahesh/Dropbox/POCs/taggy-schema/target/com/taggy/services/authentication/1.0/wsdl/employeeservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }    

    /**
     *
     * @return
     *     returns EmployeeServicePortType
     */
    @WebEndpoint(name = "employeeserviceport")
    public EmployeeServicePortType getEmployeeserviceport() {
        return super.getPort(Employeeserviceport, EmployeeServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeServicePortType
     */
    @WebEndpoint(name = "employeeserviceport")
    public EmployeeServicePortType getEmployeeserviceport(WebServiceFeature... features) {
        return super.getPort(Employeeserviceport, EmployeeServicePortType.class, features);
    }

}