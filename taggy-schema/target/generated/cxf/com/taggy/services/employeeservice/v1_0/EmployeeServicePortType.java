package com.taggy.services.employeeservice.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-03-04T09:15:35.809+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://com/taggy/services/employeeservice/v1.0", name = "employeeServicePortType")
@XmlSeeAlso({com.taggy.services.employee.v1.ObjectFactory.class, com.taggy.services.employeeservice.v1.ObjectFactory.class, com.taggy.services.common.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeeServicePortType {

    @WebMethod(action = "http://com/taggy/services/employeeservice/1.0/createEmployee")
    @WebResult(name = "createEmployeeResponse", targetNamespace = "http://com/taggy/services/employeeservice/v1.0", partName = "parameters")
    public com.taggy.services.employeeservice.v1.CreateEmployeeResponse createEmployee(
        @WebParam(partName = "parameters", name = "createEmployeeRequest", targetNamespace = "http://com/taggy/services/employeeservice/v1.0")
        com.taggy.services.employeeservice.v1.CreateEmployeeRequest parameters
    );
}