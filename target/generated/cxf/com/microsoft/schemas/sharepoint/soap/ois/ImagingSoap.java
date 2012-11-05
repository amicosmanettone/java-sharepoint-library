package com.microsoft.schemas.sharepoint.soap.ois;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:09.592+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", name = "ImagingSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ImagingSoap {

    @WebResult(name = "CreateNewFolderResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "CreateNewFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.CreateNewFolder")
    @WebMethod(operationName = "CreateNewFolder", action = "http://schemas.microsoft.com/sharepoint/soap/ois/CreateNewFolder")
    @ResponseWrapper(localName = "CreateNewFolderResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.CreateNewFolderResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.CreateNewFolderResponse.CreateNewFolderResult createNewFolder(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strParentFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strParentFolder
    );

    @WebResult(name = "RenameResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "Rename", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.Rename")
    @WebMethod(operationName = "Rename", action = "http://schemas.microsoft.com/sharepoint/soap/ois/Rename")
    @ResponseWrapper(localName = "RenameResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.RenameResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.RenameResponse.RenameResult rename(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "request", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.Rename.Request request
    );

    @WebResult(name = "GetItemsXMLDataResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "GetItemsXMLData", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetItemsXMLData")
    @WebMethod(operationName = "GetItemsXMLData", action = "http://schemas.microsoft.com/sharepoint/soap/ois/GetItemsXMLData")
    @ResponseWrapper(localName = "GetItemsXMLDataResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetItemsXMLDataResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.GetItemsXMLDataResponse.GetItemsXMLDataResult getItemsXMLData(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "itemFileNames", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.ArrayOfString itemFileNames
    );

    @WebResult(name = "DeleteResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "Delete", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.Delete")
    @WebMethod(operationName = "Delete", action = "http://schemas.microsoft.com/sharepoint/soap/ois/Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.DeleteResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.DeleteResponse.DeleteResult delete(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "itemFileNames", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.ArrayOfString itemFileNames
    );

    @WebResult(name = "GetItemsByIdsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "GetItemsByIds", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIds")
    @WebMethod(operationName = "GetItemsByIds", action = "http://schemas.microsoft.com/sharepoint/soap/ois/GetItemsByIds")
    @ResponseWrapper(localName = "GetItemsByIdsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponse.GetItemsByIdsResult getItemsByIds(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "ids", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.ArrayOfUnsignedInt ids
    );

    @WebResult(name = "ListPictureLibraryResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "ListPictureLibrary", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.ListPictureLibrary")
    @WebMethod(operationName = "ListPictureLibrary", action = "http://schemas.microsoft.com/sharepoint/soap/ois/ListPictureLibrary")
    @ResponseWrapper(localName = "ListPictureLibraryResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.ListPictureLibraryResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.ListPictureLibraryResponse.ListPictureLibraryResult listPictureLibrary();

    @WebResult(name = "DownloadResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "Download", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.Download")
    @WebMethod(operationName = "Download", action = "http://schemas.microsoft.com/sharepoint/soap/ois/Download")
    @ResponseWrapper(localName = "DownloadResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.DownloadResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.DownloadResponse.DownloadResult download(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "itemFileNames", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.ArrayOfString itemFileNames,
        @WebParam(name = "type", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        long type,
        @WebParam(name = "fFetchOriginalIfNotAvailable", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        boolean fFetchOriginalIfNotAvailable
    );

    @WebResult(name = "GetListItemsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "GetListItems", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetListItems")
    @WebMethod(operationName = "GetListItems", action = "http://schemas.microsoft.com/sharepoint/soap/ois/GetListItems")
    @ResponseWrapper(localName = "GetListItemsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.GetListItemsResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.GetListItemsResponse.GetListItemsResult getListItems(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder
    );

    @WebResult(name = "CheckSubwebAndListResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "CheckSubwebAndList", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.CheckSubwebAndList")
    @WebMethod(operationName = "CheckSubwebAndList", action = "http://schemas.microsoft.com/sharepoint/soap/ois/CheckSubwebAndList")
    @ResponseWrapper(localName = "CheckSubwebAndListResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.CheckSubwebAndListResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.CheckSubwebAndListResponse.CheckSubwebAndListResult checkSubwebAndList(
        @WebParam(name = "strUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strUrl
    );

    @WebResult(name = "EditResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "Edit", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.Edit")
    @WebMethod(operationName = "Edit", action = "http://schemas.microsoft.com/sharepoint/soap/ois/Edit")
    @ResponseWrapper(localName = "EditResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.EditResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.EditResponse.EditResult edit(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "itemFileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String itemFileName,
        @WebParam(name = "recipe", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        com.microsoft.schemas.sharepoint.soap.ois.Edit.Recipe recipe
    );

    @WebResult(name = "UploadResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
    @RequestWrapper(localName = "Upload", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.Upload")
    @WebMethod(operationName = "Upload", action = "http://schemas.microsoft.com/sharepoint/soap/ois/Upload")
    @ResponseWrapper(localName = "UploadResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/", className = "com.microsoft.schemas.sharepoint.soap.ois.UploadResponse")
    public com.microsoft.schemas.sharepoint.soap.ois.UploadResponse.UploadResult upload(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strListName,
        @WebParam(name = "strFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String strFolder,
        @WebParam(name = "bytes", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        byte[] bytes,
        @WebParam(name = "fileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        java.lang.String fileName,
        @WebParam(name = "fOverWriteIfExist", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/ois/")
        boolean fOverWriteIfExist
    );
}
