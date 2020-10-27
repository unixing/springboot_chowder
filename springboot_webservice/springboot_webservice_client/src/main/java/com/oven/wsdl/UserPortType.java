package com.oven.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2020-08-17T18:00:14.034+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "wsdl.oven.com", name = "userPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface UserPortType {

    @WebMethod
    @RequestWrapper(localName = "getList", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetList")
    @ResponseWrapper(localName = "getListResponse", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<User> getList();

    @WebMethod
    @RequestWrapper(localName = "getString", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetString")
    @ResponseWrapper(localName = "getStringResponse", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetStringResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getString(
        @WebParam(name = "msg", targetNamespace = "")
        String msg
    );

    @WebMethod
    @RequestWrapper(localName = "getUserByName", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetUserByName")
    @ResponseWrapper(localName = "getUserByNameResponse", targetNamespace = "wsdl.oven.com", className = "com.oven.wsdl.GetUserByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public User getUserByName(
        @WebParam(name = "name", targetNamespace = "")
        String name
    );
}