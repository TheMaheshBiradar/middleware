
package com.taggy.services.employeeservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createEmployeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEmployeeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reponseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reponseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEmployeeResponse", propOrder = {
    "reponseCode",
    "reponseMessage"
})
public class CreateEmployeeResponse {

    @XmlElement(required = true)
    protected String reponseCode;
    @XmlElement(required = true)
    protected String reponseMessage;

    /**
     * Gets the value of the reponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponseCode() {
        return reponseCode;
    }

    /**
     * Sets the value of the reponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponseCode(String value) {
        this.reponseCode = value;
    }

    /**
     * Gets the value of the reponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponseMessage() {
        return reponseMessage;
    }

    /**
     * Sets the value of the reponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponseMessage(String value) {
        this.reponseMessage = value;
    }

}
