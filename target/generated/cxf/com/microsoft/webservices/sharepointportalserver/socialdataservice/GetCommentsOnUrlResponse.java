
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetCommentsOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialCommentDetail" minOccurs="0"/>
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
    "getCommentsOnUrlResult"
})
@XmlRootElement(name = "GetCommentsOnUrlResponse")
public class GetCommentsOnUrlResponse {

    @XmlElement(name = "GetCommentsOnUrlResult")
    protected ArrayOfSocialCommentDetail getCommentsOnUrlResult;

    /**
     * Gets the value of the getCommentsOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public ArrayOfSocialCommentDetail getGetCommentsOnUrlResult() {
        return getCommentsOnUrlResult;
    }

    /**
     * Sets the value of the getCommentsOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public void setGetCommentsOnUrlResult(ArrayOfSocialCommentDetail value) {
        this.getCommentsOnUrlResult = value;
    }

}
