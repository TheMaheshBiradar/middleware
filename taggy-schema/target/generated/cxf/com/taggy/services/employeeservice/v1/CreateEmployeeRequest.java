
package com.taggy.services.employeeservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.taggy.services.employee.v1.EmployeeType;


/**
 * <p>Java class for createEmployeeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEmployeeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeDetail" type="{http://com/taggy/services/employee/v1.0}EmployeeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEmployeeRequest", propOrder = {
    "employeeDetail"
})
public class CreateEmployeeRequest {

    @XmlElement(required = true)
    protected EmployeeType employeeDetail;

    /**
     * Gets the value of the employeeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    public EmployeeType getEmployeeDetail() {
        return employeeDetail;
    }

    /**
     * Sets the value of the employeeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    public void setEmployeeDetail(EmployeeType value) {
        this.employeeDetail = value;
    }

}
