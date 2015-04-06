
package com.taggy.services.employeeservice.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.taggy.services.employeeservice.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateEmployeeRequest_QNAME = new QName("http://com/taggy/services/employeeservice/v1.0", "createEmployeeRequest");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://com/taggy/services/employeeservice/v1.0", "createEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.taggy.services.employeeservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateEmployeeRequest }
     * 
     */
    public CreateEmployeeRequest createCreateEmployeeRequest() {
        return new CreateEmployeeRequest();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/taggy/services/employeeservice/v1.0", name = "createEmployeeRequest")
    public JAXBElement<CreateEmployeeRequest> createCreateEmployeeRequest(CreateEmployeeRequest value) {
        return new JAXBElement<CreateEmployeeRequest>(_CreateEmployeeRequest_QNAME, CreateEmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/taggy/services/employeeservice/v1.0", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

}
