
package com.microsoft.schemas.sharepoint.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:13.060+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class ViewsSoap_ViewsSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Views");

    private ViewsSoap_ViewsSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Views.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Views ss = new Views(wsdlURL, SERVICE_NAME);
        ViewsSoap port = ss.getViewsSoap12();  
        
        {
        System.out.println("Invoking getViewHtml...");
        java.lang.String _getViewHtml_listName = "";
        java.lang.String _getViewHtml_viewName = "";
        com.microsoft.schemas.sharepoint.soap.GetViewHtmlResponse.GetViewHtmlResult _getViewHtml__return = port.getViewHtml(_getViewHtml_listName, _getViewHtml_viewName);
        System.out.println("getViewHtml.result=" + _getViewHtml__return);


        }
        {
        System.out.println("Invoking deleteView...");
        java.lang.String _deleteView_listName = "";
        java.lang.String _deleteView_viewName = "";
        port.deleteView(_deleteView_listName, _deleteView_viewName);


        }
        {
        System.out.println("Invoking updateView...");
        java.lang.String _updateView_listName = "";
        java.lang.String _updateView_viewName = "";
        com.microsoft.schemas.sharepoint.soap.UpdateView.ViewProperties _updateView_viewProperties = null;
        com.microsoft.schemas.sharepoint.soap.UpdateView.Query _updateView_query = null;
        com.microsoft.schemas.sharepoint.soap.UpdateView.ViewFields _updateView_viewFields = null;
        com.microsoft.schemas.sharepoint.soap.UpdateView.Aggregations _updateView_aggregations = null;
        com.microsoft.schemas.sharepoint.soap.UpdateView.Formats _updateView_formats = null;
        com.microsoft.schemas.sharepoint.soap.UpdateView.RowLimit _updateView_rowLimit = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewResponse.UpdateViewResult _updateView__return = port.updateView(_updateView_listName, _updateView_viewName, _updateView_viewProperties, _updateView_query, _updateView_viewFields, _updateView_aggregations, _updateView_formats, _updateView_rowLimit);
        System.out.println("updateView.result=" + _updateView__return);


        }
        {
        System.out.println("Invoking getViewCollection...");
        java.lang.String _getViewCollection_listName = "";
        com.microsoft.schemas.sharepoint.soap.GetViewCollectionResponse.GetViewCollectionResult _getViewCollection__return = port.getViewCollection(_getViewCollection_listName);
        System.out.println("getViewCollection.result=" + _getViewCollection__return);


        }
        {
        System.out.println("Invoking updateViewHtml...");
        java.lang.String _updateViewHtml_listName = "";
        java.lang.String _updateViewHtml_viewName = "";
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewProperties _updateViewHtml_viewProperties = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.Toolbar _updateViewHtml_toolbar = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewHeader _updateViewHtml_viewHeader = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewBody _updateViewHtml_viewBody = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewFooter _updateViewHtml_viewFooter = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewEmpty _updateViewHtml_viewEmpty = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.RowLimitExceeded _updateViewHtml_rowLimitExceeded = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.Query _updateViewHtml_query = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.ViewFields _updateViewHtml_viewFields = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.Aggregations _updateViewHtml_aggregations = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.Formats _updateViewHtml_formats = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml.RowLimit _updateViewHtml_rowLimit = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlResponse.UpdateViewHtmlResult _updateViewHtml__return = port.updateViewHtml(_updateViewHtml_listName, _updateViewHtml_viewName, _updateViewHtml_viewProperties, _updateViewHtml_toolbar, _updateViewHtml_viewHeader, _updateViewHtml_viewBody, _updateViewHtml_viewFooter, _updateViewHtml_viewEmpty, _updateViewHtml_rowLimitExceeded, _updateViewHtml_query, _updateViewHtml_viewFields, _updateViewHtml_aggregations, _updateViewHtml_formats, _updateViewHtml_rowLimit);
        System.out.println("updateViewHtml.result=" + _updateViewHtml__return);


        }
        {
        System.out.println("Invoking getView...");
        java.lang.String _getView_listName = "";
        java.lang.String _getView_viewName = "";
        com.microsoft.schemas.sharepoint.soap.GetViewResponse.GetViewResult _getView__return = port.getView(_getView_listName, _getView_viewName);
        System.out.println("getView.result=" + _getView__return);


        }
        {
        System.out.println("Invoking addView...");
        java.lang.String _addView_listName = "";
        java.lang.String _addView_viewName = "";
        com.microsoft.schemas.sharepoint.soap.AddView.ViewFields _addView_viewFields = null;
        com.microsoft.schemas.sharepoint.soap.AddView.Query _addView_query = null;
        com.microsoft.schemas.sharepoint.soap.AddView.RowLimit _addView_rowLimit = null;
        java.lang.String _addView_type = "";
        boolean _addView_makeViewDefault = false;
        com.microsoft.schemas.sharepoint.soap.AddViewResponse.AddViewResult _addView__return = port.addView(_addView_listName, _addView_viewName, _addView_viewFields, _addView_query, _addView_rowLimit, _addView_type, _addView_makeViewDefault);
        System.out.println("addView.result=" + _addView__return);


        }
        {
        System.out.println("Invoking updateViewHtml2...");
        java.lang.String _updateViewHtml2_listName = "";
        java.lang.String _updateViewHtml2_viewName = "";
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewProperties _updateViewHtml2_viewProperties = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.Toolbar _updateViewHtml2_toolbar = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewHeader _updateViewHtml2_viewHeader = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewBody _updateViewHtml2_viewBody = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewFooter _updateViewHtml2_viewFooter = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewEmpty _updateViewHtml2_viewEmpty = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.RowLimitExceeded _updateViewHtml2_rowLimitExceeded = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.Query _updateViewHtml2_query = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.ViewFields _updateViewHtml2_viewFields = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.Aggregations _updateViewHtml2_aggregations = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.Formats _updateViewHtml2_formats = null;
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2.RowLimit _updateViewHtml2_rowLimit = null;
        java.lang.String _updateViewHtml2_openApplicationExtension = "";
        com.microsoft.schemas.sharepoint.soap.UpdateViewHtml2Response.UpdateViewHtml2Result _updateViewHtml2__return = port.updateViewHtml2(_updateViewHtml2_listName, _updateViewHtml2_viewName, _updateViewHtml2_viewProperties, _updateViewHtml2_toolbar, _updateViewHtml2_viewHeader, _updateViewHtml2_viewBody, _updateViewHtml2_viewFooter, _updateViewHtml2_viewEmpty, _updateViewHtml2_rowLimitExceeded, _updateViewHtml2_query, _updateViewHtml2_viewFields, _updateViewHtml2_aggregations, _updateViewHtml2_formats, _updateViewHtml2_rowLimit, _updateViewHtml2_openApplicationExtension);
        System.out.println("updateViewHtml2.result=" + _updateViewHtml2__return);


        }

        System.exit(0);
    }

}
