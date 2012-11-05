
package com.microsoft.sharepoint.webpartpages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dscXml",
    "contextUrl"
})
@XmlRootElement(name = "GetDataFromDataSourceControl")
public class GetDataFromDataSourceControl {

    protected String dscXml;
    protected String contextUrl;

    /**
     * Gets the value of the dscXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscXml() {
        return dscXml;
    }

    /**
     * Sets the value of the dscXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscXml(String value) {
        this.dscXml = value;
    }

    /**
     * Gets the value of the contextUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextUrl() {
        return contextUrl;
    }

    /**
     * Sets the value of the contextUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextUrl(String value) {
        this.contextUrl = value;
    }

}
