/**
 * WsTokenService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kgstore.payment.webservice;

public interface WsTokenService extends javax.xml.rpc.Service {
    public java.lang.String getWsTokenAddress();

    public com.kgstore.payment.webservice.WsToken getWsToken() throws javax.xml.rpc.ServiceException;

    public com.kgstore.payment.webservice.WsToken getWsToken(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
