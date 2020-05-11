/**
 * WsTokenServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kgstore.payment.webservice;

public class WsTokenServiceLocator extends org.apache.axis.client.Service implements com.kgstore.payment.webservice.WsTokenService {

    public WsTokenServiceLocator() {
    }


    public WsTokenServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsTokenServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsToken
    private java.lang.String WsToken_address = "http://localhost:8080/Payment/services/WsToken";

    public java.lang.String getWsTokenAddress() {
        return WsToken_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsTokenWSDDServiceName = "WsToken";

    public java.lang.String getWsTokenWSDDServiceName() {
        return WsTokenWSDDServiceName;
    }

    public void setWsTokenWSDDServiceName(java.lang.String name) {
        WsTokenWSDDServiceName = name;
    }

    public com.kgstore.payment.webservice.WsToken getWsToken() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsToken_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsToken(endpoint);
    }

    public com.kgstore.payment.webservice.WsToken getWsToken(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kgstore.payment.webservice.WsTokenSoapBindingStub _stub = new com.kgstore.payment.webservice.WsTokenSoapBindingStub(portAddress, this);
            _stub.setPortName(getWsTokenWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsTokenEndpointAddress(java.lang.String address) {
        WsToken_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kgstore.payment.webservice.WsToken.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kgstore.payment.webservice.WsTokenSoapBindingStub _stub = new com.kgstore.payment.webservice.WsTokenSoapBindingStub(new java.net.URL(WsToken_address), this);
                _stub.setPortName(getWsTokenWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsToken".equals(inputPortName)) {
            return getWsToken();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.payment.kgstore.com", "WsTokenService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.payment.kgstore.com", "WsToken"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsToken".equals(portName)) {
            setWsTokenEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
