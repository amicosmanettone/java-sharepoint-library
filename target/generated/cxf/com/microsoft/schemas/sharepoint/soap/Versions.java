package com.microsoft.schemas.sharepoint.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:12.904+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "Versions", 
                  wsdlLocation = "file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/versions.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/") 
public class Versions extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Versions");
    public final static QName VersionsSoap = new QName("http://schemas.microsoft.com/sharepoint/soap/", "VersionsSoap");
    public final static QName VersionsSoap12 = new QName("http://schemas.microsoft.com/sharepoint/soap/", "VersionsSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/versions.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Versions.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/versions.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Versions(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Versions(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Versions() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Versions(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Versions(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Versions(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns VersionsSoap
     */
    @WebEndpoint(name = "VersionsSoap")
    public VersionsSoap getVersionsSoap() {
        return super.getPort(VersionsSoap, VersionsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VersionsSoap
     */
    @WebEndpoint(name = "VersionsSoap")
    public VersionsSoap getVersionsSoap(WebServiceFeature... features) {
        return super.getPort(VersionsSoap, VersionsSoap.class, features);
    }
    /**
     *
     * @return
     *     returns VersionsSoap
     */
    @WebEndpoint(name = "VersionsSoap12")
    public VersionsSoap getVersionsSoap12() {
        return super.getPort(VersionsSoap12, VersionsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VersionsSoap
     */
    @WebEndpoint(name = "VersionsSoap12")
    public VersionsSoap getVersionsSoap12(WebServiceFeature... features) {
        return super.getPort(VersionsSoap12, VersionsSoap.class, features);
    }

}
